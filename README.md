# Personal Project List

* Based off of [Framework7 Vue + Webpack App Template](https://github.com/framework7io/framework7-template-vue-webpack)
* The purpose of this project is to show a list of cool websites/projects that you may have worked on or want a reference to.
* Data is hard coded from `config/data/list.json`

## Getting started

* Make sure to copy list.json `cp ./config/data/list.template.json ./config/data/list.json`
  * Or you can go to http://jsoneditoronline.org copy the contents of `config/data/list.template.json` then click save > online & use that **id** in the **retrieveList.sh**
    * `sh retrieveList.sh -i "id"`
  * This json is used to for the descriptions and list items.

## Usage

### 1. Download this repository
```
git clone https://github.com/framework7io/framework7-template-vue-webpack my-app
```

Repository will be downloaded into `my-app/` folder

### 2. Instal dependencies

Go to the downloaded repository folder and run:
```
npm install
```

This will download latest version of Framework7, Framework7-Vue, Vue and required icon fonts (to `/src/fonts/`)

### 3. Run the app

```
npm run dev
```

App will be opened in browser at `http://localhost:8080/`

### 4. Build app for production

```
npm run build
```

The output will be at `www/` folder

## Use with cordova
Cordova is not enabled by default, so make sure to remove the comment tags around the "<script src="cordova.js"></script>" line in [projectroot]/index.html
```
<body>
  <div id="app"></div>

  <!-- Cordova -->

  <script src="cordova.js"></script>

  <!-- built script files will be auto injected -->
</body>
```
It will be added during the build process to Android/iOS. 

Just put the contents of `www` folder in your cordova's project root `www` folder

## One command install

```
git clone https://github.com/framework7io/framework7-template-vue-webpack my-app &&
cd my-app &&
npm install &&
npm run dev
```

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build
```

### Katalon Ui Selenium tests

Setup dependencies
Needed dynamic path using this

```bash
cp Katalon/Personal_Projects/Data Files/ListLengths.template.dat Katalon/Personal_Projects/Data Files/ListLengths.dat
```

Can use ide to generate cmd

Mac katalon terminal command

```bash
/Applications/Katalon\ Studio.app/Contents/MacOS/katalon--args -noSplash  -runMode=console -consoleLog -projectPath="fullpathtorepo/Katalon/Personal_Projects/Personal_Projects.prj" -retry=0 -testSuitePath="Test Suites/Regression" -executionProfile="default" -browserType="Chrome (headless)"
```

## Project Structure

* `src/assets` - folder with static assets (images)
* `src/components` - folder with custom `.vue` components
* `src/css` - put custom app CSS styles here. Don't forget to import them in `main.js`
* `src/pages` - app `.vue` pages
* `src/main.js` - main app file where you include/import all required libs and init app
* `src/routes.js` - app routes
* `src/app.vue` - main app structure/component
