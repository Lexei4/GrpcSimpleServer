package client;

import grpcExampleBaeldung.src.HelloRequest;
import grpcExampleBaeldung.src.HelloResponse;
import grpcExampleBaeldung.src.HelloService2Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8087)
                .usePlaintext()
                .build();

        HelloService2Grpc.HelloService2BlockingStub stub
                = HelloService2Grpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Baeldung")
                .setLastName("gRPC")
                .build());

        System.out.println(helloResponse.toString());

//        channel.shutdown();
    }
}
