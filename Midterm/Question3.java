public class Question3 {
    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();
        Moody m1 = new Happy();
        Moody m2 = new Sad();

        psychiatrist.examine(m1);
        psychiatrist.observe(m1);
        System.out.println(psychiatrist.toString(m1));

        psychiatrist.examine(m2);
        psychiatrist.observe(m2);
        System.out.println(psychiatrist.toString(m2));
    }
}

abstract class Moody {
    String mood;

    abstract public String getMood();

    abstract public void ExpressFeelings();

    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!");
    }
}


class Sad extends Moody {
    @Override
    public String getMood() {
        return "sad";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("'waah','boo hoo','weep','sob'");
    }

    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}

class Happy extends Moody {
    @Override
    public String getMood() {
        return "happy";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}

class Psychiatrist{
    public void examine (Moody moody) {
        System.out.println("How are you feeling today?");
        moody.queryMood();
    }

    public void observe(Moody moody) {
        moody.ExpressFeelings();
    }

    public String toString(Moody moody) {
        return "Observation: " + moody.toString();
    }
}
