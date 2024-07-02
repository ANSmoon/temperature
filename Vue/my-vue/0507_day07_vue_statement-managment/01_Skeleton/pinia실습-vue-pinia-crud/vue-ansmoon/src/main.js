import './assets/style.css'
import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'

const app = createApp(App)
app.use(createPinia()).mount('#app')

// createApp(App).use(createPinia()).mount('#app')