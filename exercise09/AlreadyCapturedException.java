package exercise09;

public class AlreadyCapturedException extends Exception {
    public AlreadyCapturedException() {
    }
    public AlreadyCapturedException(String msg) {
        super(msg);
    }
}
