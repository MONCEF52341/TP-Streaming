package emsi.moncef.services;

import emsi.moncef.stub.SalutationGrpc;
import emsi.moncef.stub.Signin.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class SalutationService extends SalutationGrpc.SalutationImplBase {
    @Override
    public StreamObserver<NomRequest> login(StreamObserver<NomResponse> responseObserver) {
        return new StreamObserver<NomRequest>() {
            @Override
            public void onNext(NomRequest value) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                NomResponse.Builder response = NomResponse.newBuilder();
                response.setMsgResponse("Salut à tous");
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }
        };
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8089).addService(new SalutationService()).build();
        server.start();
        System.out.println("Server started on " + server.getPort());
        server.awaitTermination();
    }
}
