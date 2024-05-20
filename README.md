# LastFm Chart Generator

## Overview

The LastFm Chart Generator is an Android application that leverages the LastFm API to create visual charts based on a user's listening history. Users can generate charts by filling out a form with their LastFm username, a timestamp, and a limit on the number of albums to be included.

## Features

- **User Input Form**: Submit your LastFm username, timestamp, and limit to generate charts.
- **Chart Generation**: Visual representation of albums listened to by the user.
- **Data Fetching**: Retrieves data from the LastFm API.

## Getting Started

### Prerequisites

- Android Studio installed on your development machine.
- A LastFm API key.

### Setup Instructions

1. **Clone the Repository**

   ```bash
   git clone https://github.com/aislanlima13/lastfmchart.git
   cd lastfm-chart-generator
   ```

2. **Obtain a LastFm API Key**

   You need to register an application on [LastFm](https://www.last.fm/api) to get an API key.

3. **Store the API Key in `gradle.properties`**

   - Locate the `gradle.properties` file in your project directory.
   - Add your LastFm API key to the `gradle.properties` file as follows:

     ```properties
     LASTFM_API_KEY=your_api_key_here
     ```

### Building the Project

1. Open the project in Android Studio.
2. Sync the project with Gradle files to ensure the API key is correctly configured.
3. Build and run the project on an Android device or emulator.

### Usage

1. Launch the application on your Android device.
2. Fill in the form with the required data:
   - **Username**: Your LastFm username.
   - **Timestamp**: The timestamp from which to start fetching data.
   - **Limit**: The maximum number of albums to be displayed.
3. Submit the form to generate the chart.

## Contributing

We welcome contributions to the LastFm Chart Generator project! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch with a descriptive name for your feature or bugfix.
3. Make your changes and commit them with clear messages.
4. Push your changes to your fork.
5. Open a pull request detailing your changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

## Contact

For any inquiries or issues, please open an issue on the GitHub repository or contact the project maintainer at [your.email@example.com](aislan.martins99@gmail.com).

---

Thank you for using the LastFm Chart Generator! We hope you find it useful and look forward to your feedback and contributions.

            
