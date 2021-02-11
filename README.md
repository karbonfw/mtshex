[![CircleCI](https://circleci.com/gh/karbonfw/mtshex.svg?style=shield)](https://circleci.com/gh/karbonfw/mtshex)
[![CircleCI](https://circleci.com/gh/karbonfw/mtshex/tree/develop.svg?style=shield)](https://circleci.com/gh/karbonfw/mtshex/tree/develop)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# How to work with this project
Type `gradlew build` to build it.
To work with source code, open this project with IntelliJ and enable Lombok plugin. The IDE will automatically recognize its gradle nature.

# How to run the app
First you need to clone, build and run a fork of original my-thai-star:
```bash
git clone https://github.com/karbonfw/my-thai-star.git
```
Run the web app located in `java/mtsj`. It will run H2 and bootstrap a database on port 9090.
Now run the web app located in this project (`mtshex`) located in `infra/web`.

Access: `localhost:8082/dishmanagement/v1/dish/1`.

# Spotless
There is spotless configured for this project. The `gradlew build` will fail in case of any violations. 
Run the `gradlew spotlessApply` to automatically fix these violations.
