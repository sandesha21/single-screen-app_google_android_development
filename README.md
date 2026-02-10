# Single Screen Restaurant Android App

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84.svg?style=for-the-badge&logo=android-studio&logoColor=white)
![Material Design](https://img.shields.io/badge/Material%20Design-757575?style=for-the-badge&logo=material-design&logoColor=white)

![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)
![Project Status](https://img.shields.io/badge/Status-Complete-success.svg?style=flat-square)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen.svg?style=flat-square)
![Gradle](https://img.shields.io/badge/Gradle-8.5.2-blue.svg?style=flat-square)
![Target SDK](https://img.shields.io/badge/Target%20SDK-36-orange.svg?style=flat-square)


Android Nanodegree - Project: Build a Single Screen App

A single-screen Android app showcasing Lisa's Italian Restaurant, featuring authentic Italian cuisine in Dublin, CA.

---

## 🏷️ Keywords & Topics

**Primary Keywords:** Android Development • Mobile App • Restaurant App • Single Screen Design • User Interface  
**Technical Stack:** Java • Android Studio • XML Layouts • Material Design • ScrollView • Intent Actions • AndroidX Libraries  
**Business Focus:** Restaurant Branding • Customer Engagement • Contact Integration • Local Business • Food Service  
**Industry:** Food & Beverage • Restaurant Technology • Mobile Applications • Local Business • Hospitality  
**Project Type:** Mobile Application Development | Industry: Restaurant & Food Service | Focus: Customer Experience & Business Showcase

---

## 📁 File Structure

```
├── app/src/main/
│   ├── java/com/example/lisasitalianrestaurant/
│   │   └── MainActivity.java              # Main activity - handles UI and system insets
│   ├── res/
│   │   ├── drawable/                      # Images and icons
│   │   ├── layout/                        # UI layouts (activity_main.xml)
│   │   └── values/                        # Colors, strings, styles, dimensions
│   └── AndroidManifest.xml
├── app/src/test/java/com/example/lisasitalianrestaurant/
│   └── MainActivityTest.java              # Unit tests for MainActivity
├── app/src/androidTest/java/com/example/lisasitalianrestaurant/
│   └── MainActivityInstrumentedTest.java  # UI instrumented tests
├── gradle/                                # Gradle wrapper
├── screenshots/                           # App screenshots
├── build.gradle                           # Project build config
├── settings.gradle
├── .gitignore
├── README.md
└── LICENSE                                # License information
```

---

## 🎯 Project Overview

This is an **upgraded version** of the original single-screen Android application, enhanced with modern Android development practices and updated dependencies. The app showcases "Lisa's Italian Restaurant" with improved UI/UX and follows current Android development standards.

### Key Improvements in This Version:
- **Updated to Android SDK 36** (Android 15) with minimum SDK 28
- **Java 17 toolchain** for better performance and modern language features
- **Latest AndroidX libraries** including Material Design Components 1.13.0
- **Enhanced ScrollView layout** for better content organization
- **Improved resource management** with proper color schemes and dimensions
- **Better accessibility support** with comprehensive content descriptions
- **Modern Gradle build system** (8.5.2) with optimized configurations

The application serves as a digital business card, providing customers with easy access to important information while demonstrating modern Android development concepts such as:
- Responsive ScrollView layout design
- Intent handling for phone calls, emails, and maps
- Resource management and string externalization
- Material Design 3 components and theming
- Modern build configurations and dependency management
- Accessibility-first design principles

**Note:** This project demonstrates both fundamental and modern Android development practices, suitable for learning current industry standards.

---

## 🚀 Getting Started

### Prerequisites
- **Android Studio** (Flamingo or later recommended)
- **Java Development Kit (JDK)** 17 or higher
- **Android SDK** with API level 28+ (Android 9.0)
- **Gradle** 8.5+ (included with Android Studio)

### Installation & Setup
1. **Clone the repository**
   ```bash
   git clone https://github.com/sandesha21/single-screen-app_google_android_development.git
   cd single-screen-app_google_android_development
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned directory and select it

3. **Build the project**
   - Android Studio will automatically sync Gradle dependencies
   - Wait for the build to complete

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Shift + F10`

### Project Structure
The project follows standard Android architecture with clean separation of concerns and proper resource organization.

---

## App Features

**Business Information:**
- Restaurant name and branding
- Multiple Italian food images
- Complete contact information
- Business description and hours

**Interactive Elements:**
- Clickable phone number for direct calling
- Tappable email address for quick contact
- Interactive address for map navigation
- Website link for online presence

**Technical Implementation:**
- Responsive ScrollView layout with RelativeLayout
- Material Design 3 theming with custom Italian color palette
- Modern AndroidX libraries and components
- Accessibility support with comprehensive content descriptions
- Externalized string resources for internationalization support
- Optimized for Android 9.0+ with target SDK 36
- Java 17 toolchain for enhanced performance

---

## Business Details (sample)
Lisa's Italian Restaurant is a local establishment located in Dublin, CA, offering authentic Italian cuisine with a focus on family dining and special occasions.

- **Name**: Lisa's Italian Restaurant
- **Location**: 104 Grafton St, Dublin, CA 94568
- **Phone**: 510-111-1111
- **Email**: info@lisasRestaurant.com
- **Website**: www.lisasrestaurant.com
- **Hours**: Everyday from 11AM-10PM
- **Specialty**: Authentic Italian food with party reservations

---

## 📱 Screenshots

<div align="center">
  <img src="screenshots/homepage.png" alt="Lisa's Italian Restaurant Android App Screenshot" width="300"/>
  <p><em>Main screen showcasing restaurant information and interactive elements</em></p>
</div>

---

## 🛠️ Technical Specifications

- **Minimum SDK**: 28 (Android 9.0)
- **Target SDK**: 36 (Android 15)
- **Compile SDK**: 36
- **Java Version**: 17
- **Gradle Version**: 8.5.2
- **Build Tools**: Android Gradle Plugin 8.5.2

### Key Dependencies:
- AndroidX AppCompat 1.7.1
- Material Design Components 1.13.0
- ConstraintLayout 2.2.1
- AndroidX Preference 1.2.1
- AndroidX Core 1.15.0
- JUnit 4.13.2 (Unit Testing)
- AndroidX Test Runner 1.7.0 (Instrumented Testing)
- Espresso 3.7.0 (UI Testing)

---

## 🧪 Testing

This project includes unit and instrumented tests for quality assurance.

### Running Tests

**Unit Tests** (run locally on your machine):
```bash
./gradlew testDebugUnitTest
```

**Instrumented Tests** (run on Android emulator or device):
```bash
./gradlew connectedAndroidTest
```

### Test Coverage

- **MainActivityTest**: Verifies MainActivity class structure and inheritance
- **MainActivityInstrumentedTest**: Tests UI elements and layout rendering

---

✅ Business name and branding  
✅ Multiple high-quality business photos  
✅ Complete contact information (phone, email, website)   
✅ Compelling business description  
✅ Hours of operation  
✅ Modern Android development practices  
✅ Accessibility compliance  
✅ Material Design 3 implementation  
✅ Responsive layout design

---

## � Upgrade from Original Version

This project is an enhanced version of the [original single-screen app](https://github.com/sandesha21/single-screen-app_google_android_development/tree/v5_working) with significant improvements:

### What's New:
- **Modern Android SDK**: Upgraded from API 21+ to API 28+ (minimum) and API 36 (target)
- **Java 17**: Updated from Java 8 for better performance and modern language features
- **Latest Dependencies**: All AndroidX libraries updated to latest stable versions
- **Enhanced UI**: Improved layout with better resource organization and color schemes
- **Better Accessibility**: Comprehensive content descriptions and accessibility support
- **Modern Build System**: Updated Gradle and build tools for faster builds
- **Improved Resource Management**: Better organized colors, dimensions, and string resources

### Migration Benefits:
- Future-proof codebase compatible with latest Android versions
- Better performance and security with modern dependencies
- Enhanced user experience with Material Design 3 components
- Improved maintainability and code organization

---

## 👨‍💻 Author  

**Sandesh S. Badwaik**  
- Google Android Nanodegree Graduate
- Mobile App Developer
- Applied Data Scientist & Machine Learning Engineer
- Passionate about creating intuitive user experiences

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sbadwaik/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/sandesha21)

---

🌟 **If you found this project helpful, please give it a ⭐!**
