class floatprintf {
    // s% for strings
    // %d for digits that arent decimals
    // f% are for decimals
    // memberikan angka seperti "|%5d|\n" akan membentuk spasi dan jika diberi negatif seperti  
    // "|%-5d|\n" akan memberikan spasi di akhir string
    // "|%15.2|\n" akan memberikan spasi sebanyak 15 dan juga hanya memperbolehkan 2 desimal dari desimal yang nanti akan dimasukan
    public static void main(String args[]) {
        float nilaiA = 98;
        float nilaiB = 78;
        float nilaiC = 89;
        
        float rataRata = (nilaiA + nilaiB + nilaiC)/3;
        System.out.printf ("Rata rata :  %.2f \n", rataRata);
      }
}