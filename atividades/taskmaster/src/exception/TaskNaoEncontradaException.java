package exception;

public class TaskNaoEncontradaException extends Exception {
    public TaskNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}