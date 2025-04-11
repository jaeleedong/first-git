import com.sun.deploy.security.SelectableSecurityManager;

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for(int i = 1; i <= cards.length; i++) {
                cards[i-1] = new SutdaCard(i>10 ? i-10 : i, (i==1 || i==3 || i==8) ? true : false);
            }
        }
    void shuffle(){
        for(int i = 0; i < cards.length; i++) {
            int ran = (int)(Math.random()*cards.length);
            SutdaCard tmp = cards[ran];
            cards[ran] = cards[i];
            cards[i] = tmp;
        }
    }
    SutdaCard pick(int index){
        return cards[index];
    }
    SutdaCard pick(){
        return cards[(int)(Math.random()*cards.length)];
    }
}

class SutdaCard {
    final int num;
    final boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    // info() Object toString() . 대신 클래스의 을 오버라이딩했다
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
//
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
