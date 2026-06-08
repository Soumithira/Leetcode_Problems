class Solution {
    public String reverseVowels(String s) {
        ArrayList <Character> v=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='A'|| c=='e'|| c=='E'|| c=='i'|| c=='I'|| c=='o'|| c=='O'|| c=='u'|| c=='U')
            v.add(c);
        }
        int e=v.size()-1;
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='A'|| c=='e'|| c=='E'|| c=='i'|| c=='I'|| c=='o'|| c=='O'|| c=='u'|| c=='U')
            res+=v.get(e--);
            else
            res+=c;
        }
        return res;
    }
}