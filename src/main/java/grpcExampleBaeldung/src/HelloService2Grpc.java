package grpcExampleBaeldung.src;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: HelloService2.proto")
public final class HelloService2Grpc {

  private HelloService2Grpc() {}

  public static final String SERVICE_NAME = "grpcExampleBaeldung.src.HelloService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpcExampleBaeldung.src.HelloRequest,
      grpcExampleBaeldung.src.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = grpcExampleBaeldung.src.HelloRequest.class,
      responseType = grpcExampleBaeldung.src.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcExampleBaeldung.src.HelloRequest,
      grpcExampleBaeldung.src.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<grpcExampleBaeldung.src.HelloRequest, grpcExampleBaeldung.src.HelloResponse> getHelloMethod;
    if ((getHelloMethod = HelloService2Grpc.getHelloMethod) == null) {
      synchronized (HelloService2Grpc.class) {
        if ((getHelloMethod = HelloService2Grpc.getHelloMethod) == null) {
          HelloService2Grpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<grpcExampleBaeldung.src.HelloRequest, grpcExampleBaeldung.src.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcExampleBaeldung.src.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcExampleBaeldung.src.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloService2MethodDescriptorSupplier("hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloService2Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloService2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloService2Stub>() {
        @java.lang.Override
        public HelloService2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloService2Stub(channel, callOptions);
        }
      };
    return HelloService2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloService2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloService2BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloService2BlockingStub>() {
        @java.lang.Override
        public HelloService2BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloService2BlockingStub(channel, callOptions);
        }
      };
    return HelloService2BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloService2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloService2FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloService2FutureStub>() {
        @java.lang.Override
        public HelloService2FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloService2FutureStub(channel, callOptions);
        }
      };
    return HelloService2FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloService2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(grpcExampleBaeldung.src.HelloRequest request,
        io.grpc.stub.StreamObserver<grpcExampleBaeldung.src.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcExampleBaeldung.src.HelloRequest,
                grpcExampleBaeldung.src.HelloResponse>(
                  this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloService2Stub extends io.grpc.stub.AbstractAsyncStub<HelloService2Stub> {
    private HelloService2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloService2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloService2Stub(channel, callOptions);
    }

    /**
     */
    public void hello(grpcExampleBaeldung.src.HelloRequest request,
        io.grpc.stub.StreamObserver<grpcExampleBaeldung.src.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloService2BlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloService2BlockingStub> {
    private HelloService2BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloService2BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloService2BlockingStub(channel, callOptions);
    }

    /**
     */
    public grpcExampleBaeldung.src.HelloResponse hello(grpcExampleBaeldung.src.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloService2FutureStub extends io.grpc.stub.AbstractFutureStub<HelloService2FutureStub> {
    private HelloService2FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloService2FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloService2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcExampleBaeldung.src.HelloResponse> hello(
        grpcExampleBaeldung.src.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloService2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloService2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((grpcExampleBaeldung.src.HelloRequest) request,
              (io.grpc.stub.StreamObserver<grpcExampleBaeldung.src.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloService2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpcExampleBaeldung.src.HelloService2OuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService2");
    }
  }

  private static final class HelloService2FileDescriptorSupplier
      extends HelloService2BaseDescriptorSupplier {
    HelloService2FileDescriptorSupplier() {}
  }

  private static final class HelloService2MethodDescriptorSupplier
      extends HelloService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloService2MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloService2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloService2FileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
