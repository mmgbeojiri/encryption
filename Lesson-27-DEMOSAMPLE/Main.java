

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
    char[] sub2 = {'™','Š','†','§','€','Å','¬','þ','µ','Ž'};

    return ReplaceVowels(NonConstantCipher(Reverse(str), 1),sub1, sub2);
    //return NonConstantCipher(Reverse(str), 1);
  }

  String decode(String str) {
    char[] sub1 = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
    char[] sub2 = {'™','Š','†','§','€','Å','¬','þ','µ','Ž'};

    // first: replace the censors with vowels; 
    // second: find a way to reverse NonConstantCipher (remember how we used the function in desmos and its inverse?)
    // third: reverse string
    // fourth: return string

    String str1 = ReplaceVowels(str, sub2 , sub1 );
    String str2 = NonConstantCipher(str1, -1 );
    String str3 = Reverse(str2);
    return str3;
    


    


    
  }
  void init(){

    // Encoding message
     
    String file1 = Input.readFile("Original.txt");
    System.out.println(file1);

    String encodedFile = encode(file1);
    System.out.println(encodedFile);

    String decodedFile = decode(encodedFile);
    System.out.println(decodedFile);

    String file2 = Input.readFile("test.txt");

    System.out.println(encode(file2));
    System.out.println(decode("/ŽŽþspŽlvŽ!qq$jlcW$&l¬dxyb"));
       

    

    //Input.writeFile("Decode1.txt", decodedMsg3);
    
    
  }


}