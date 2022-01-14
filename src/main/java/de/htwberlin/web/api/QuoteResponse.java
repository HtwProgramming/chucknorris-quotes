package de.htwberlin.web.api;

public class QuoteResponse {

  private String quote;

  public QuoteResponse(String quote) {
    this.quote = quote;
  }

  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }
}
