import tester.*;
class LongStrings {
    // String[] firstStrings;
    // int n;
    String[] longStrings(String[] firstStrings, int n) {
        
        

        int total = 0;
        for (int i = 0; i < firstStrings.length; i ++) {
            if (firstStrings[i].length() >= n) {
                total += 1;
            }
            
        }
        String[] allStrings = new String[total];

        //for (int i = 0; i < firstStrings.length; i ++) {
            //if (firstStrings.length <= n) {
        int newIndex = 0;
        for (String s: firstStrings) {
                //word = firstStrings[i];
            if (s.length() >= n) {
                    
                allStrings[newIndex] = s;
                newIndex += 1;
            }
            
                //delete i

        }
        return allStrings;
    }


    //return firstStrings;
    
        void testCheckExpect(Tester t) {
        String[] base1 = new String[] {"kiwi", "apple", "banana"};
        String[] check1 = new String[] {"apple", "banana"};
        
        t.checkExpect(longStrings(base1, 5), check1);
        t.checkExpect(longStrings(base1, 3), base1);
        }

}
// //how to return the values i got into an array

// // class testExamples {
    
// // }