# soma-weather-viewer-android
Soma Weather Viewer는 모바일 권장 아키텍쳐 오픈소스입니다.

## 🔎 Overview
<p align="center">
<img src="https://user-images.githubusercontent.com/62279741/230784060-f2112ede-d412-43d8-b486-e7cd64b249ef.png" alt="drawing" width="250px" />
<img src="https://user-images.githubusercontent.com/62279741/230784068-fa828893-d25f-462d-8a8e-34f05a95d8e2.png" alt="drawing" width="250px" />
<img src="https://user-images.githubusercontent.com/62279741/230784072-2dcd9725-e8fe-4f24-912f-ebc1ec69e0d3.png" alt="drawing" width="250px" />
</p>



## 🏛 Architecture
### Modularization
<p align="center">
<img width="300" alt="image" src="https://user-images.githubusercontent.com/62279741/230784454-9d5d8622-b0eb-4c3a-b9e7-cdcee2482649.png">
</p>

- **app 모듈**
- **feature 모듈 (home, setting)** : 독립적인 기능을 분리하며, view와 viewmodel로 구성함
- **core 모듈 (common, common-ui, foundation)** : 다른 모듈에서 자주 사용하는 코드로 구성  
  common-ui는 공통적으로 사용되는 UI를 포함시켜 디자인 재사용성을 높이고 통일감 있는 디자인을 제공함  
  foundation은 어떠한 앱이든 가져가 사용할 수 있는 독립적인 모듈임



### Clean Architecture
<p align="center">
<img width="1000" alt="image" src="https://user-images.githubusercontent.com/62279741/230785673-4dc97be6-73c7-466b-ab8b-12f7f5097cd4.png">
</p>


### Tech Stack & Library
- MVVM, databinding, Clean Architecture
- Modularization, hilt, coroutines
- retrofit2, glide
- i18n
