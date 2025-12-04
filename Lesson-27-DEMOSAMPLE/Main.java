class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  public String Reverse(String str) {
        String bld = "";
        for (int i = 0; i < str.length(); i++) {
            bld = str.charAt(i) + bld;
        }
        return bld;
    };

  public static String NonConstantCipher(String str, int encode) {
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
  
  public static char replaceChar(char ch, char[] sub1, char[] sub2){
        for (int i = 0; i < sub1.length; i++) {
            if (sub1[i] == ch) {
                return sub2[i];
            }
        }
        return ch;
    }
   
  public static String ReplaceVowels(String str, char[] sub1, char[] sub2) {
        String bld = "";
        for (int i = 0; i < str.length(); i++) {
            bld += replaceChar(str.charAt(i), sub1, sub2);
        }
        return bld;
    }
   
    public static void main(String[] args) {

    }
  void init(){

    // This example we are substituting all lower case 
    // letters to another lower case letter.
    char[] sub = new char[5];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'i';
    sub[3] = 'o';
    sub[4] = 'u';

    char[] sub2 = new char[5];
    sub2[0] = '\u2663';  // Club
    sub2[1] = '\u2660';  // Spade
    sub2[2] = '\u2665';  // Heart
    sub2[3] = '\u2666';  // Diamond
    sub2[4] = '\u2836';  // Bralle symbol

    
    // Encoding message
        System.out.println("Try programiz.pro");
        char[] sub1 = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        char[] sub2 = {'&','$','!','#','^','@','3','|','0','*'};
       
       
        System.out.println(Reverse("Attack"));
        System.out.println(NonConstantCipher("Attack", 1));
        System.out.println(ReplaceVowels("Attack", sub1, sub2));
       
        System.out.println(ReplaceVowels(NonConstantCipher(Reverse("Attack"),1),sub1, sub2));
       

    
    // decoding message
    String file2 = Input.readFile("Encode1.txt");
    
    String decodedMsg1 = reverse(file2);
    //Input.writeFile("Decode1.txt", decodedMsg1);
    
    String decodedMsg2 = decode(decodedMsg1);
    //Input.writeFile("Decode2.txt", decodedMsg2);
    
     String decodedMsg3 = subEncryption(decodedMsg2, sub2, sub);
    //Input.writeFile("Decode1.txt", decodedMsg3);
    
    
  }
  // Level 1 reverse string
  String reverse(String txt){
    String bld ="";
    
    return bld;
  }
  
  
  //Level 2 Cipher encoding with no wrapping
  String encode(String txt){
    String bld="";
    
     
    return bld;
  }

  
  String decode(String txt){
    String bld="";
   
    return bld;
  }

  // Level 3 Substituion encoding
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld="";
   
    return bld;
  }
  
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}