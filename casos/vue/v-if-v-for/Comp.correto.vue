<!-- correto: sentinel-vue-v-if-com-v-for -->
<template>
  <ul>
    <template v-for="i in itens" :key="i.id">
      <li v-if="i.ativo">{{ i.nome }}</li>
    </template>
  </ul>
</template>
