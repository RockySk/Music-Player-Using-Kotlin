# Music Player Using Kotlin

A modern Android music player app built with Kotlin and Android Studio. It allows users to browse local audio files, play songs, create playlists, mark favorites, sort tracks, and customize the app experience.

## Overview

This project is a full Android music player interface that demonstrates:

- local music scanning from device storage
- audio playback controls
- favorites management
- playlist support
- search and sorting
- theme customization
- feedback and settings screens

## Features

- Play and browse local songs from the device
- Shuffle and repeat controls
- Search songs by title
- View total songs and song metadata
- Add/remove favorite tracks
- Create and manage playlists
- Open player, settings, favourites, and about screens
- Theme switching for UI customization
- Feedback form for user suggestions or issues

## Tech Stack

- Kotlin
- Android SDK
- AndroidX libraries
- Material Components
- Gson for saving playlist/favorites data
- Glide for image loading

## Project Structure

```text
Music-Player-Using-Kotlin/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/sourabhkulkarni/musicPlayer/
│   │   │   └── res/
│   └── build.gradle
├── gradle/
├── .gitignore
├── build.gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
├── README.md
└── music_player_screenshots/
```

## Prerequisites

Before running the project, install:

- Android Studio (latest stable version recommended)
- JDK 11 or newer
- Android SDK with API level 33 installed
- A physical Android device or an emulator

## Installation

1. Clone the repository:

```bash
git clone https://github.com/RockySk/Music-Player-Using-Kotlin.git
```

2. Open the project in Android Studio.

3. Let Gradle sync the project.

4. When prompted, install any missing Android SDK components.

5. Connect a physical device or start an emulator.

## Running the App

1. In Android Studio, select the project root.
2. Choose a device or emulator.
3. Click Run or use:

```bash
./gradlew assembleDebug
```

Then run the app from Android Studio.

## Important Notes

This app reads songs from the device storage, so it may require storage permission on Android 10+ devices. The app also stores favorites and playlist data locally using shared preferences.

## Main Screens

The app includes the following screens:

- Home / music library screen
- Now playing screen
- Favourites screen
- Playlist screen
- Playlist details screen
- Settings screen
- About screen
- Feedback screen

## Customization

You can customize the app by editing:

- app theme values in `res/values/themes.xml`
- colors in `res/values/colors.xml`
- strings in `res/values/strings.xml`
- player behavior in Kotlin activity classes under `app/src/main/java/com/sourabhkulkarni/musicPlayer/`

## Build Commands

### Debug build

```bash
./gradlew assembleDebug
```

### Clean build

```bash
./gradlew clean
```

## Screenshots

The repo includes screenshot assets under `music_player_screenshots/`.

## License

This project is intended for educational and learning purposes.

## Author

Sourabh Kulkarni
