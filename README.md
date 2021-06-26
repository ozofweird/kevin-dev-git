# kevin-dev-git-flow

![](https://img.shields.io/badge/version-0.0.1-brightgreen)

## Index
- [Overview](#overview)
- [Getting Started](#getting-started)
- [Release Notes](#release-notes)
- [Issues](#issues)
- [Contributing](#contributing)
- [Authors](#authors)
- [License](#license)
- [References](#references)
- [Commit Message (Gitmoji)](#commit-messages-gitmoji)

## About
Github 프로젝트 관리와 Git-flow 적응을 위한 프로젝트입니다.

## Overview
이용할 수 있는 기능은 없습니다.

## Getting Started
Spring Boot 기본 구성으로 진행했습니다.

### 버전 표기 (v1.2.1)

- v1

주 버전을 의미하며 새로운 기능으로 인한 데이터베이스 변경 혹은 새로운 기술 적용할 때 변경됨

- v1.2

보조 버전을 의미하며 주 버전 처럼 기능이 현저히 바뀌거나 기술이 새롭게 바뀌지 않지 다양한 주요 기능이 추가되거나 UX가 바뀔 때 변경됨

- v1.2.1

유지 보수 버전을 의미하며 주요 기능은 아니지만 보조 기능성이 추가 혹은 개선되었을 때 변경

### Git-flow

![](./docs/images/git_flow.png)

|브랜치|설명|
|----|---|
|master|배포 되었거나 배포될 소스가 저장되는 브랜치, 배포가 될 때마다 태그만 들아주는 형식으로 관리|
|develop|다음 배포를 위해 개발을 진행하는 브랜치|
|feature|각 개발에 의해 기능 단위 개발이 진행되는 브랜치|
|hotfixs|배포 버전에 생긴 문제를 긴급한 트러블 슈팅이 필요할 때 개발이 진행되는 브랜치|
|release|내부적으로 배포할 준비가 되었다고 생각하는 소스가 저장되는 브랜치 (QA)|

### Project Structures
MainApplication에서만 동작을 테스트했습니다.

### Installing
1. GitKraken

## Release Notes
* 0.0.1
    * 테스트

## Issues
없습니다.

## Contributing
ozofweird

## Authors
- [ozofweird](https://github.com/ozofweird) - **Kevin Ahn**

## License
ozofweird

## References
- [나의 Git Flow 적응기](https://jeong-pro.tistory.com/196)

---

## Commit messages (Gitmoji)

|Gitmoji|Code|Description|
|:-----:|:---:|:--------:|
|🎨|art|파일/코드 구조 개선|
|🩹|adhesive_bandage|간단한 수정|
|⚡️|zap|성능 향상|
|🔥️|fire|코드나 파일 삭제|
|🐛️|bug|버그 해결|
|🚑️|ambulance|긴급 수정|
|✨️|sparkles|새로운 기능|
|📝️|memo|문서 추가/수정|
|💄️|lipstick|화면 UI 추가/수정|
|🎉️|tada|프로젝트 시작|
|✅️|white_check_mark|테스트 추가/수정|
|🔒️|lock|보안 이슈 수정|
|🔖️|bookmark|릴리즈/버전 태그|
|🚧|construction|작업 진행 중|
|💚|green_heart|CI 빌드 수정|
|⬇️|arrow_down|의존성 버전 다운|
|⬆️|arrow_up|의존성 버전 업|
|📌|pushpin|특정 버전 의존성 고정|
|👷|construction_worker|CI 빌드 시스템 추가/수정|
|📈|chart_with_upwards_trend|분석, 추적 코드 추가/수정|
|♻️|recycle|코드 리팩토링|
|➕|heavy_plus_sign|의존성 추가|
|➖|heavy_minus_sign|의존성 제거|
|🔧|wrench|설정 파일 추가/수정|
|🔨|hammer|개발 스크립트 추가/수정|
|🌐|globe_with_meridians|다국어 지원|
|💩|poop|안좋은 코드 추가|
|⏪|rewind|변경 내용 되돌리기|
|🔀|twisted_rightwards_arrows|브랜치 합병|
|👽|alien|외부 API 변화로 인한 수정|
|🚚|truck|리소스 이동/이름 변경|
|💥|boom|놀라운 기능 소개|
|🍱|bento|에셋 추가/수정|
|💡|bulb|주석 추가/수정|
|💬|speech_balloon|스트링 파일 추가/수정|
|🗃|card_file_box|데이버베이스 관련 수정|
|🔊|loud_sound|로그 추가/수정|
|🔇|mute|로그 삭제|
|📱|iphone|반응형 디자인|
|🙈|see_no_evil|gitignore 추가|