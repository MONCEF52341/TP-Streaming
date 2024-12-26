package emsi.moncef.stub;

import com.google.protobuf.Descriptors;
import io.grpc.*;
import io.grpc.protobuf.ProtoFileDescriptorSupplier;
import io.grpc.protobuf.ProtoMethodDescriptorSupplier;
import io.grpc.protobuf.ProtoServiceDescriptorSupplier;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.StreamObserver;
import io.grpc.stub.annotations.RpcMethod;

import javax.annotation.Generated;
import java.util.Iterator;

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
@Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: signin.proto")
public final class MultiplicationGrpc {

  private MultiplicationGrpc() {}

  public static final String SERVICE_NAME = "Multiplication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile MethodDescriptor<Signin.NombreRequest,
      Signin.TableResponse> getGetTableMultiplicationMethod;

  @RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTableMultiplication",
      requestType = Signin.NombreRequest.class,
      responseType = Signin.TableResponse.class,
      methodType = MethodDescriptor.MethodType.SERVER_STREAMING)
  public static MethodDescriptor<Signin.NombreRequest,
      Signin.TableResponse> getGetTableMultiplicationMethod() {
    MethodDescriptor<Signin.NombreRequest, Signin.TableResponse> getGetTableMultiplicationMethod;
    if ((getGetTableMultiplicationMethod = MultiplicationGrpc.getGetTableMultiplicationMethod) == null) {
      synchronized (MultiplicationGrpc.class) {
        if ((getGetTableMultiplicationMethod = MultiplicationGrpc.getGetTableMultiplicationMethod) == null) {
          MultiplicationGrpc.getGetTableMultiplicationMethod = getGetTableMultiplicationMethod = 
              MethodDescriptor.<Signin.NombreRequest, Signin.TableResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Multiplication", "getTableMultiplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(ProtoUtils.marshaller(
                  Signin.NombreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(
                  Signin.TableResponse.getDefaultInstance()))
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
  public static MultiplicationStub newStub(Channel channel) {
    return new MultiplicationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MultiplicationBlockingStub newBlockingStub(
      Channel channel) {
    return new MultiplicationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MultiplicationFutureStub newFutureStub(
      Channel channel) {
    return new MultiplicationFutureStub(channel);
  }

  /**
   */
  public static abstract class MultiplicationImplBase implements BindableService {

      /**
       *
       */

    public void getTableMultiplication(Signin.NombreRequest request,
                                       StreamObserver<Signin.TableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTableMultiplicationMethod(), responseObserver);
    }

    @Override public final ServerServiceDefinition bindService() {
      return ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTableMultiplicationMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                Signin.NombreRequest,
                Signin.TableResponse>(
                  this, METHODID_GET_TABLE_MULTIPLICATION)))
          .build();
    }
  }

  /**
   */
  public static final class MultiplicationStub extends AbstractStub<MultiplicationStub> {
    private MultiplicationStub(Channel channel) {
      super(channel);
    }

    private MultiplicationStub(Channel channel,
                               CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MultiplicationStub build(Channel channel,
                                       CallOptions callOptions) {
      return new MultiplicationStub(channel, callOptions);
    }

    /**
     */
    public void getTableMultiplication(Signin.NombreRequest request,
                                       StreamObserver<Signin.TableResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTableMultiplicationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MultiplicationBlockingStub extends AbstractStub<MultiplicationBlockingStub> {
    private MultiplicationBlockingStub(Channel channel) {
      super(channel);
    }

    private MultiplicationBlockingStub(Channel channel,
                                       CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MultiplicationBlockingStub build(Channel channel,
                                               CallOptions callOptions) {
      return new MultiplicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public Iterator<Signin.TableResponse> getTableMultiplication(
        Signin.NombreRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTableMultiplicationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MultiplicationFutureStub extends AbstractStub<MultiplicationFutureStub> {
    private MultiplicationFutureStub(Channel channel) {
      super(channel);
    }

    private MultiplicationFutureStub(Channel channel,
                                     CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MultiplicationFutureStub build(Channel channel,
                                             CallOptions callOptions) {
      return new MultiplicationFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_TABLE_MULTIPLICATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      ServerCalls.UnaryMethod<Req, Resp>,
      ServerCalls.ServerStreamingMethod<Req, Resp>,
      ServerCalls.ClientStreamingMethod<Req, Resp>,
      ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MultiplicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MultiplicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TABLE_MULTIPLICATION:
          serviceImpl.getTableMultiplication((Signin.NombreRequest) request,
              (StreamObserver<Signin.TableResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public StreamObserver<Req> invoke(
        StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MultiplicationBaseDescriptorSupplier
      implements ProtoFileDescriptorSupplier, ProtoServiceDescriptorSupplier {
    MultiplicationBaseDescriptorSupplier() {}

    @Override
    public Descriptors.FileDescriptor getFileDescriptor() {
      return Signin.getDescriptor();
    }

    @Override
    public Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Multiplication");
    }
  }

  private static final class MultiplicationFileDescriptorSupplier
      extends MultiplicationBaseDescriptorSupplier {
    MultiplicationFileDescriptorSupplier() {}
  }

  private static final class MultiplicationMethodDescriptorSupplier
      extends MultiplicationBaseDescriptorSupplier
      implements ProtoMethodDescriptorSupplier {
    private final String methodName;

    MultiplicationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile ServiceDescriptor serviceDescriptor;

  public static ServiceDescriptor getServiceDescriptor() {
    ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MultiplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MultiplicationFileDescriptorSupplier())
              .addMethod(getGetTableMultiplicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
