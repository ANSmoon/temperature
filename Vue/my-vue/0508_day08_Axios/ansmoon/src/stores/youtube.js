import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import axios from 'axios'

export const useYoutubeStore = defineStore('youtube', () => {
  const videos = ref([])
  const selectedVideo = ref(null)

  const youtubeSearch = function(keyword){
    const URL = 'https://www.googleapis.com/youtube/v3/search'
    const API_KEY = 'AIzaSyCkIqp8fhp2q7SKLtTIjaItBPTgtJCRlFo'

    axios({
      url: URL,
      method: 'GET',
      params: {
        key: API_KEY,
        part: 'snippet',
        maxResults: 10,
        q: keyword,
        type: 'video'
      }
    })
    .then((response)=>{
      videos.value = response.data.items
      console.log(response.data)
    })
    .catch(() => {
      
    })
  }
  
  const clickVideo = function(video){
    selectedVideo.value = video
  }

  return { 
    youtubeSearch,
    clickVideo,
    videos,
    selectedVideo,
   }
})
