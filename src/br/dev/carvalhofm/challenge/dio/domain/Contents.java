package br.dev.carvalhofm.challenge.dio.domain;

public abstract class Contents {
   protected static final double STANDARD_XP = 100d;
   private String title;
   private String describe;

   public abstract double xpCalculate();

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getDescrible() {
      return describe;
   }

   public void setDescrible(String describle) {
      this.describe = describle;
   }
}
