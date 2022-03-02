import tester.*;
class Pair {
    int a;
    int b;
    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int getA() {
        return a;
    }
    void setA(int a) {
        this.a = a;
    }
    int getB() {
        return b;
    }
    void setB(int b) {
        this.b = b;
    } //how to make the pair of ints into an array?
}
public class PairSelect {
    /*method getAs to make an array of Pair, return array of int
    remove b*/
    //int pair[] = new int[2];
    int[] getAs(Pair[] pair) {
        int[] onlyAs = new int[pair.length]; // !!
        
        for (int i = 0; i < pair.length; i++) {
            
            onlyAs[i] = pair[i].a;
            
            }
        //onlyAs[]
    return onlyAs; 
    }
    void testGetAs(Tester t) {
        Pair pairOne = new Pair(2, 3);
        Pair pairTwo = new Pair(3, 4);
        Pair pairThree = new Pair(4, 5);
        Pair pairFive = new Pair(5, 6);
        Pair[] pairFour = new Pair[] {pairOne, pairTwo};
        t.checkExpect(getAs(new Pair[] {pairOne, pairTwo}), new int[] {2, 3});
        t.checkExpect(getAs(new Pair[] {pairTwo, pairThree}), new int[] {3, 4});
        t.checkExpect(getAs(new Pair[] {pairOne, pairThree}), new int[] {2, 4});
        t.checkExpect(getAs(new Pair[] {pairOne, pairFive}), new int[] {2, 5});
        
    }
}

// class testPairExamples {
    
        
// }    

