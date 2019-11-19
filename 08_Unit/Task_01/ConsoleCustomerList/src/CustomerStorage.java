import java.util.ArrayList;
import java.util.HashMap;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data)
    {
        String[] components = data.split("\\s+");

        StringBuilder errors = new StringBuilder();
        checkListErrorsInCorrectInputData(components).forEach(errors::append);
        if(errors.length() != 0){
            throw new RuntimeException("Error input data:" + errors);
        }

        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    private ArrayList<String> checkListErrorsInCorrectInputData(String[] components){
        ArrayList<String> typeErrors = new ArrayList<>();
        String patternNumberPhone = "\\+7\\d{10}";
        String patternEmail = ".{2,70}@\\w{2,}\\.\\w{2,}";

        if(components.length != 4){
            typeErrors.add("\nError length - " + components.length);
        }
        if(!components[3].matches(patternNumberPhone)){
            typeErrors.add("\nIncorrect phone - " + components[3]);
        }
        if(!components[2].matches(patternEmail)){
            typeErrors.add("\nIncorrect email " + components[2]);
        }
        return typeErrors;
    }


    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)
    {
        if(!storage.containsKey(name)){
            throw new RuntimeException(name + " is not contained in the base");
        }
        storage.remove(name);
    }

    public int getCount()
    {
        return storage.size();
    }
}