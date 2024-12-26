package emsi.moncef.services;

import emsi.moncef.stub.MultiplicationGrpc.MultiplicationImplBase;
import emsi.moncef.stub.Signin.TableResponse;
import emsi.moncef.stub.Signin.NombreRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;


public class MultiplicationService extends MultiplicationImplBase {

    @Override
    public void getTableMultiplication(emsi.moncef.stub.Signin.NombreRequest request,
                                       io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.TableResponse> responseObserver) {
        int nombre = request.getNombre();
        int limite = request.getLimite();
        for (int i = 1; i <= limite; i++) {
            String result = nombre + " x " + i + " = " + (nombre * i);
            TableResponse response = TableResponse.newBuilder()
                    .setResultat(result)
                    .build();
// Envoyer le message au client
            responseObserver.onNext(response);
        }
// Terminer le streaming
        responseObserver.onCompleted();
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8090).addService(new MultiplicationService()).build();
        server.start();
        System.out.println("Server started on " + server.getPort());
        server.awaitTermination();
    }
}
