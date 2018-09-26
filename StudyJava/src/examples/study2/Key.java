package examples.study2;

public class Key {

    public int key;

    public Key(int number) {
        this.key = number;
    }

    @Override
    public int hashCode() {
        return key;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key){
            Key compareKey = (Key) obj;

            if(this.key == compareKey.key){
                return true;
            }
        }
        return false;
    }
}
