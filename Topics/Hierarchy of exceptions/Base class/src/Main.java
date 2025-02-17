// update the class
class MyException extends Throwable {

    MyException(String message) {
        super(message);
    }

    public String getMessage(String message) {
        return message;
    }
}

//do not change the code
class Main {
    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException.getMessage());
        Class<?> superClass = myException.getClass().getSuperclass();
        System.out.println(superClass.equals(Throwable.class));
    }
}