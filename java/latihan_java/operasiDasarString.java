class operasiDasarString{
    //length() untuk menghitung karakter atau panjang dari sebuah string
    public static void main(String[]arg){
        String kalimat = "Belajar java.kata pak jokowi,belajar belajar dan belajar.supaya negara kita bisa makmur.supaya negara kita bisa maju.kerja,kerja dan kerja.supaya masyarakat bisa punya penghasilan yang cukup.sehingga  taraf hidup meningkat.Kita tidak bisa hanya berpangku tangan dan melihat saja,kita harus aktif bergerak,kita harus kreatif,inisiatif dan inspiratif,sehingga kita tidak pasif.orang yang pasif itu akan selalu gagal,hidupnya tidak merdeka,hidupnya merana,serba kekurangan dan tidak bahagia,untuk urusan akhirat saja kita harus selalu bergerak,sholat,wudhu,membaca qur'an,bersedekah dan sebagainya";
        System.out.println("Panjang kalimat: "+ kalimat.length());
        
        
        System.out.println();
    //toUpperCase() method ini digunakan untuk mengubah karakter dalam string menjadi huruf besar
        String kata="Belajar Java";
        System.out.println("Uppercase kata : " + kata.toUpperCase());
        
        System.out.println();
        
        String Str=new String("Welcome to  Tutorialspoint.com");
        System.out.print("Return Value :");
        System.out.println(Str.toUpperCase());
    
        
        System.out.println();
        
        //merubah char ke dalam String menggunakan array
        char[] helloArray={'h','e','l','l','o'};
        String helloString=new String(helloArray);
        System.out.println(helloString);
        
        System.out.println();
        
        //method length untuk mengetahui jumlah katrakter dalam string
        String palindrome= "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println("String length : " + len);
        System.out.println();
        
        
        //concatenating string(penggabungan String)
        String string1="Saw I was";
        System.out.println("Dot " + string1 + " Tod");
        
        //method toLowerCase method ini digunakan untuk merubah karakter dalam String menjadi huruf kecil
        String str2=new String("BELAJAR JAVA");
        System.out.print("Return value: ");
        System.out.println(str2.toLowerCase());
        
        
        
        System.out.println();
        
        //method replace digunakan untuk menggenti kata.
        String str3=new String("Perkenlkan,nama saya suroto.saya dari cilacap,merantau ke daerah bogor.saat ini saya bekerja sebagai kuli galon.sambil belajar bahasa java,saya berharap nanti saya bisa  menjadi seorang programmer beneran.bahasa java itu cukup sulit,ada bagian-bagian yang memang mudah dipahami namun banyak juga yang harus bersusah payah untuk mengerti.java memang bahasa pemrograman yang cukup populer.banyak sekali digunakan dalam  industri.salahsatu contohnyaa android,ia dibangun dengan mengguanakan bahasa pemrogramana java");
        System.out.print("Return value: " + str3.replace("java","c") + "\n");//jika yang ingin diganti cuma satu kata saja maka menggunakan replaceFirst
        
        System.out.println();
        
        //equals method digunakan untuk membandingkan variabel string dengan string lainnya.jika isi dari string itu sama maka akan memberikan nilai true,dan jika tidak sama maka akan memberikan nilai flase.
        String kembar1=new String("Belajar Java");
                                  String kembar2=new String("Belajar java");
if(kembar1.equals(kembar2)){
    System.out.println("isi kata sama");
}else{
    System.out.println("isi kata tidak sama"+"\n");
}
        
        System.out.println();
        
        //indexOf(),method ini digunakan untuk mencari index dari suatu kata/kalimat.berapa di karakter berapa string dicari
     String kalimat2="Belajar Java,memang menyenangkan.tapi kadang kala ada rasa jenuh juga.dan cara untuk mengatasinya ketika belajar sambil mendengarkan musik....hehe,lumayan kan jadi ngantuk";
        System.out.println("Posisi 'sambil' dalam kalimat2 : " + kalimat2.indexOf("sambil"));
        
        //contains(),method ini digunakan untuk mengetahui ada kata tertentu dalam kalimat.method ini akan mengembalikan nilai True jika terdapat kata  yang dimaksud dan mengembalikan nilai False jika tidak terdapat kata yang dimaksud dalam kalimat.
        String kalimat3="Belajar Java";
        System.out.println("Terdapat 'Java' dalam kalimat: " + kalimat3.contains("Java"));
        
        System.out.println();
        
        //split(),method ini digunakan untuk memecah kalimat berdasarkan separator/pemisah
        
        String kalimat4="Belajar bahasa Java";
        String[] pecah  = kalimat4.split(" ");//split
        System.out.println("Hasil Pecahan: ");
        for(int counter=0;counter < pecah.length;counter++){
            System.out.println(" " + pecah[counter]);
            
            //length,toUpperCase,toLowerCase,contains,equals,replace,split,indexOf
            
            
        }
        
    }
}
        