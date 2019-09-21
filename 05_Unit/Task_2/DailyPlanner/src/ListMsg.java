public enum ListMsg {
    HELLO("Hello!"),
    TYPE("Type command (or help)"),
    HELP("List - print all deals \nAdd (+number) - add new deal (optionaly, it adds in the position) \nEdit (num)- change deal" +
            "\nDelete (num)- delete this deal \nExit - exit"),
    ERROR("Try again.(type help) Error -"),
    EXIT("Bye-bye!");

    private String msg;

    ListMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
