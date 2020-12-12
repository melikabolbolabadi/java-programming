public class First extends Thread
{
    private static First first = new First ();
    public static First us () { return first; }

    public void save(UserEntity userEntity) throws Exception
    {
        Repository repository = new Repository();
        userEntity.setUsername(userEntity.getUsername());
        userEntity.setPassword(userEntity.getPassword());

        repository.insertTable(userEntity);
        repository.commit();

    }

    public void Run() throws Exception {
        Ui ui =new Ui();
        save(new UserEntity().setId(Integer.parseInt(ui.text1.getText())).
                setUsername(ui.text2.getText()).
                setPassword(ui.text3.getText()));

    }
}
