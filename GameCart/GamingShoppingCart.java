package GameCart;

import java.util.ArrayList;

public class GamingShoppingCart {
    //Fields
    private ArrayList<String> gameCart = new ArrayList<>();

    //Get gameCart
    public ArrayList<String> getGameCart() {
        return gameCart;
    }
    //addGamesToCart
    public void addGame(String game) {
        gameCart.add(game);
    }

    //Remove games
    public void removeGame(String game) {
        gameCart.remove(game);
    }

    //Position of the game
    public int positionOfGame(String game){
        return findGame(game) + 1;
    }

    //Find games
    public int findGame(String game) {
        return gameCart.indexOf(game);
    }

    //Confirm if game exists
    public boolean onFile(String game) {
        int position = findGame(game);
        if (position >= 0) {
            return true;
        }else {
            return false;
        }
    }
    //Print gameCart list
    public void printGameCart() {
        for (int i=0; i<gameCart.size(); i++) {
            System.out.println(gameCart.get(i));
        }
    }
}
