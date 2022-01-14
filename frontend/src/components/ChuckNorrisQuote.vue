<template>
  <div class="quote-wrapper">
    <img alt="chuck-norris" src="../assets/chuck-norris.png" class="img" />
    <h1 class="quote">"{{ randomQuote }}"</h1>
  </div>
</template>

<script>
export default {
  name: "ChuckNorrisQuote",
  data() {
    return {
      randomQuote:
        "Wenn alles funktioniert, steht hier ein Chuck Norris Spruch.",
    };
  },
  methods: {
    loadRandomQuote() {
      // ToDo: Rufen Sie hier den Rest-Endpunkt des Servers auf
    },
    getRandomInt(maxExclusive) {
      return Math.floor(Math.random() * maxExclusive);
    },
  },
};
</script>

<style>
.quote-wrapper {
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  height: 100%;
  margin: auto;
}
h1 {
  font-size: 4vw;
  text-align: center;
  font-style: italic;
}
.img {
  width: 50%;
}
.quote {
  width: 50%;
}
</style>
