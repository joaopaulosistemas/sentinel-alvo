<!-- correto: sentinel-vue-v-for-sem-key -->
<template>
  <ul>
    <li v-for="i in itens" :key="i.id">{{ i.nome }}</li>
  </ul>
</template>
