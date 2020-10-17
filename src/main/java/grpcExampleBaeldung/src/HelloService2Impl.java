package grpcExampleBaeldung.src;

import io.grpc.stub.StreamObserver;

public class HelloService2Impl extends HelloService2Grpc.HelloService2ImplBase {

    @Override
    public void hello(
            HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        String greeting = new StringBuilder()
                .append("Hello, ")
                .append(request.getFirstName())
                .append(" ")
                .append(request.getLastName())
                .toString();

/* Билдер, возвращающий ответ*/
        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(response); // отправка ответа клиенту
        responseObserver.onCompleted(); // окончание gRPC взаимодействия. Если не вызвать onCompleted() - клиент будет висеть в ожидании дополнительных данных от сервака
    }
}