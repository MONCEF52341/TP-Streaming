package emsi.moncef.services;

import emsi.moncef.stub.Signin.NamesRequest;
import emsi.moncef.stub.Signin.NamesResponse;
import emsi.moncef.stub.SuffleGrpc.SuffleImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShuffleService extends SuffleImplBase {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8091).addService(new ShuffleService()).build();
        server.start();
        System.out.println("Server started on " + server.getPort());
        server.awaitTermination();
    }

    @Override
    public StreamObserver<NamesRequest> shuffleWords(
            StreamObserver<NamesResponse> responseObserver) {
        return new StreamObserver<NamesRequest>() {
            @Override
            public void onNext(NamesRequest request) {
                String word = request.getNom();
                List<String> permutations = generatePermutations(word);
                for (String permutation : permutations) {
                    NamesResponse response = NamesResponse.newBuilder()
                            .setMsgResponse(permutation)
                            .build();
                    responseObserver.onNext(response);
                }
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    private List<String> generatePermutations(String word) {
        List<String> result = new ArrayList<>();
        if (word == null) {
            return null;
        } else if (word.length() == 0) {
            result.add("");
            return result;
        }

        char first = word.charAt(0);
        String remainder = word.substring(1);
        List<String> words = generatePermutations(remainder);
        for (String subWord : words) {
            for (int j = 0; j <= subWord.length(); j++) {
                result.add(insertCharAt(subWord, first, j));
            }
        }
        return result;
    }

    private String insertCharAt(String str, char c, int i) {
        String begin = str.substring(0, i);
        String end = str.substring(i);
        return begin + c + end;
    }
}

