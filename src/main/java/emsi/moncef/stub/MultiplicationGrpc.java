package emsi.moncef.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.15.0)",
        comments = "Source: signin.proto")
public final class MultiplicationGrpc {

    public static final String SERVICE_NAME = "Multiplication";
    private static final int METHODID_GET_TABLE_MULTIPLICATION = 0;
    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<emsi.moncef.stub.Signin.NombreRequest,
            emsi.moncef.stub.Signin.TableResponse> getGetTableMultiplicationMethod;
    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    private MultiplicationGrpc() {
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getTableMultiplication",
            requestType = emsi.moncef.stub.Signin.NombreRequest.class,
            responseType = emsi.moncef.stub.Signin.TableResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<emsi.moncef.stub.Signin.NombreRequest,
            emsi.moncef.stub.Signin.TableResponse> getGetTableMultiplicationMethod() {
        io.grpc.MethodDescriptor<emsi.moncef.stub.Signin.NombreRequest, emsi.moncef.stub.Signin.TableResponse> getGetTableMultiplicationMethod;
        if ((getGetTableMultiplicationMethod = MultiplicationGrpc.getGetTableMultiplicationMethod) == null) {
            synchronized (MultiplicationGrpc.class) {
                if ((getGetTableMultiplicationMethod = MultiplicationGrpc.getGetTableMultiplicationMethod) == null) {
                    MultiplicationGrpc.getGetTableMultiplicationMethod = getGetTableMultiplicationMethod =
                            io.grpc.MethodDescriptor.<emsi.moncef.stub.Signin.NombreRequest, emsi.moncef.stub.Signin.TableResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                                    .setFullMethodName(generateFullMethodName(
                                            "Multiplication", "getTableMultiplication"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            emsi.moncef.stub.Signin.NombreRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            emsi.moncef.stub.Signin.TableResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new MultiplicationMethodDescriptorSupplier("getTableMultiplication"))
                                    .build();
                }
            }
        }
        return getGetTableMultiplicationMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MultiplicationStub newStub(io.grpc.Channel channel) {
        return new MultiplicationStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MultiplicationBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new MultiplicationBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MultiplicationFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new MultiplicationFutureStub(channel);
    }

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (MultiplicationGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new MultiplicationFileDescriptorSupplier())
                            .addMethod(getGetTableMultiplicationMethod())
                            .build();
                }
            }
        }
        return result;
    }

    /**
     *
     */
    public static abstract class MultiplicationImplBase implements io.grpc.BindableService {

        /**
         *
         */
        public void getTableMultiplication(emsi.moncef.stub.Signin.NombreRequest request,
                                           io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.TableResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetTableMultiplicationMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getGetTableMultiplicationMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            emsi.moncef.stub.Signin.NombreRequest,
                                            emsi.moncef.stub.Signin.TableResponse>(
                                            this, METHODID_GET_TABLE_MULTIPLICATION)))
                    .build();
        }
    }

    /**
     *
     */
    public static final class MultiplicationStub extends io.grpc.stub.AbstractStub<MultiplicationStub> {
        private MultiplicationStub(io.grpc.Channel channel) {
            super(channel);
        }

        private MultiplicationStub(io.grpc.Channel channel,
                                   io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MultiplicationStub build(io.grpc.Channel channel,
                                           io.grpc.CallOptions callOptions) {
            return new MultiplicationStub(channel, callOptions);
        }

        /**
         *
         */
        public void getTableMultiplication(emsi.moncef.stub.Signin.NombreRequest request,
                                           io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.TableResponse> responseObserver) {
            asyncServerStreamingCall(
                    getChannel().newCall(getGetTableMultiplicationMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     *
     */
    public static final class MultiplicationBlockingStub extends io.grpc.stub.AbstractStub<MultiplicationBlockingStub> {
        private MultiplicationBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private MultiplicationBlockingStub(io.grpc.Channel channel,
                                           io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MultiplicationBlockingStub build(io.grpc.Channel channel,
                                                   io.grpc.CallOptions callOptions) {
            return new MultiplicationBlockingStub(channel, callOptions);
        }

        /**
         *
         */
        public java.util.Iterator<emsi.moncef.stub.Signin.TableResponse> getTableMultiplication(
                emsi.moncef.stub.Signin.NombreRequest request) {
            return blockingServerStreamingCall(
                    getChannel(), getGetTableMultiplicationMethod(), getCallOptions(), request);
        }
    }

    /**
     *
     */
    public static final class MultiplicationFutureStub extends io.grpc.stub.AbstractStub<MultiplicationFutureStub> {
        private MultiplicationFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private MultiplicationFutureStub(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MultiplicationFutureStub build(io.grpc.Channel channel,
                                                 io.grpc.CallOptions callOptions) {
            return new MultiplicationFutureStub(channel, callOptions);
        }
    }

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final MultiplicationImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(MultiplicationImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_TABLE_MULTIPLICATION:
                    serviceImpl.getTableMultiplication((emsi.moncef.stub.Signin.NombreRequest) request,
                            (io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.TableResponse>) responseObserver);
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

    private static abstract class MultiplicationBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        MultiplicationBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return emsi.moncef.stub.Signin.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Multiplication");
        }
    }

    private static final class MultiplicationFileDescriptorSupplier
            extends MultiplicationBaseDescriptorSupplier {
        MultiplicationFileDescriptorSupplier() {
        }
    }

    private static final class MultiplicationMethodDescriptorSupplier
            extends MultiplicationBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        MultiplicationMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }
}
