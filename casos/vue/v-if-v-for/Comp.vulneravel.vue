<template>
  <ul>
    <!-- alvo: sentinel-vue-v-if-com-v-for -->
    <li v-for="i in itens" :key="i.id" v-if="i.ativo">{{ i.nome }}</li>
  </ul>
</template>
