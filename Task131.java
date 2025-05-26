
class Recipe {
  void showIngredients() {
    System.out.println("Generic recipe ingredients.");
  }
}

class Afritada extends Recipe {
  @Override
  void showIngredients() {
    System.out.println("Afritada: Tomato Sauce, Meat, Potatoes & Carrots");
  }
}

class Mechado extends Recipe {
  @Override
  void showIngredients() {
    System.out.println("Mechado: Tomato Sauce, Meat, Potatoes & Carrots, Tomato Paste");
  }
}

class Menudo extends Recipe {
  @Override
  void showIngredients() {
    System.out.println("Menudo: Tomato Sauce, Meat, Potatoes & Carrots, Raisins, Hotdog");
  }
}

class Caldereta extends Recipe {
  @Override
  void showIngredients() {
    System.out.println("Caldereta: Tomato Sauce, Meat, Potatoes & Carrots, Tomato Paste, Liver Spread, Cheese");
  }
}

public class Task131 {
  public static void main(String[] args) {
    Recipe meal1 = new Afritada();
    Recipe meal2 = new Mechado();
    Recipe meal3 = new Menudo();
    Recipe meal4 = new Caldereta();

    meal1.showIngredients();
    meal2.showIngredients();
    meal3.showIngredients();
    meal4.showIngredients();
  }
}
