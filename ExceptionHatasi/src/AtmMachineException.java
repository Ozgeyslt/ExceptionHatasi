public class AtmMachineException extends ArithmeticException {


    public AtmMachineException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Gunluk para cekimi 20.000 üstünde olamaz");
    }
}
