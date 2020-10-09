public class SearchUsers extends GetUsers {

    public int searchexception(int a)
    {
        if (name1.equalsIgnoreCase(name2))
            if (family1.equalsIgnoreCase(family2))
                if (age1 == age2)
                    a=2;
        return a;
    }
}