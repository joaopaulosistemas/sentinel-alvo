<!-- correto: sentinel-vue-reactive-desestruturado -->
<script setup>
import { reactive, toRefs } from 'vue';
const estado = reactive({ n: 0 });
const { n } = toRefs(estado);
</script>
