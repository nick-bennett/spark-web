import static spark.Spark.*;

public class Main {

  public static void main(String[] args) {
    get("/hello", (req, res) -> {
      res.body("Hello World!");
      return res;
    });
  }

}
