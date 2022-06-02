

public class Surveillance {
  boolean monitorBehavior = false;
  Person person;
  boolean withinReach = false; 


  public Surveillance(Person whoEver) {
    person = whoEver; 
  }

  public void registerPerson() {
    withinReach = true;
  
      if (withinReach) {
        monitorBehavior = true;
      }
  }

  public void getIdentity() {
    Person personRegistered = person;
  }

  public void followsYouEveryWhere() {
    String forever = "privacy is any rights you have to control your personal information and how it is used";
    
    System.out.println(forever);
  }

  public void drawAttention() {
    boolean attentionCaught = true;
    boolean motion = false;

    while (!motion) {
      registerPerson();
      
      if (!motion) {
        registerPerson();

        motion = true;
      } else {
        
        break;
      }
    }

    attentionCaught = false;
    withinReach = false;
  }

  public static void main(String[] args) {
    int id = 0000000000; 
    Person you = new Person(id);
    Surveillance surveillance = new Surveillance(you);

    surveillance.registerPerson();
    surveillance.getIdentity();
    surveillance.drawAttention();
    surveillance.followsYouEveryWhere();

    for (int CCTVinDK = 1499999; CCTVinDK > 0 ; CCTVinDK--) {
      surveillance.followsYouEveryWhere();
    }

  }
}