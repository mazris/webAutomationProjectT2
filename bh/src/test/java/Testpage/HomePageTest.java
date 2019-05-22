package Testpage;


import HomePage1.HomePage;

public class HomePageTest extends HomePage {

    public void Searchtest() throws InterruptedException {
        openpage();
        Thread.sleep( 3000 );
        search( "canon" );
        Thread.sleep( 3000 );
    }

    public void select() throws InterruptedException {

        Thread.sleep( 3000 );
        selectOption();


    }


}
