class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  // Method 1
  String Reverse(String str) {
        String bld = "";
        for (int i = 0; i < str.length(); i++) {
            bld = str.charAt(i) + bld;
        }
        return bld;
    };
  // Method 2
  String NonConstantCipher(String str, int encode) {
        // Encode = 1; Decode = -1;
        int x = 0;
        int ascii = 0;
        String bld = "";
        for (int i = 0; i < str.length(); i++) {
            ascii = (int)str.charAt(i);
            ascii += (Math.floor(x % 5) + 1) * encode;
            x++;
            bld += (char)ascii;
        }
        return bld;
    }
  
  char replaceChar(char ch, char[] sub1, char[] sub2){
        for (int i = 0; i < sub1.length; i++) {
            if (sub1[i] == ch) {
                return sub2[i];
            }
        }
        return ch;
    }
  // method 3
  String ReplaceVowels(String str, char[] sub1, char[] sub2) {
        String bld = "";
        for (int i = 0; i < str.length(); i++) {
            bld += replaceChar(str.charAt(i), sub1, sub2);
        }
        return bld;
    }
   
  String encode(String str) {
    char[] sub1 = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
    char[] sub2 = {'&','$','!','#','^','@','3','|','0','*'};

    return ReplaceVowels(NonConstantCipher(Reverse(str), 1),sub1, sub2);
  }
  void init(){

    // Encoding message
     
    String file1 = Input.readFile("Original.txt");
    
    System.out.println(encode(file1));
       

    

    //Input.writeFile("Decode1.txt", decodedMsg3);
    
    
  }

  
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}