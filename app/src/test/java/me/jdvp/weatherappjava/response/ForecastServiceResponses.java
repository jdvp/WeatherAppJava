package me.jdvp.weatherappjava.response;

/**
 * Created by jdvp on 6/10/18.
 */

public class ForecastServiceResponses {

    public static final String SUCCESSFUL_RESPONSE_6_HRS =
            "{\n" +
                    "  \"latitude\": 40.108963,\n" +
                    "  \"longitude\": -82.9605226,\n" +
                    "  \"timezone\": \"America/New_York\",\n" +
                    "  \"currently\": {\n" +
                    "    \"time\": 1528676333,\n" +
                    "    \"summary\": \"Partly Cloudy\",\n" +
                    "    \"icon\": \"partly-cloudy-day\",\n" +
                    "    \"nearestStormDistance\": 6,\n" +
                    "    \"nearestStormBearing\": 210,\n" +
                    "    \"precipIntensity\": 0,\n" +
                    "    \"precipProbability\": 0,\n" +
                    "    \"temperature\": 73.83,\n" +
                    "    \"apparentTemperature\": 74.47,\n" +
                    "    \"dewPoint\": 65.61,\n" +
                    "    \"humidity\": 0.76,\n" +
                    "    \"pressure\": 1009.8,\n" +
                    "    \"windSpeed\": 6.65,\n" +
                    "    \"windGust\": 6.65,\n" +
                    "    \"windBearing\": 279,\n" +
                    "    \"cloudCover\": 0.56,\n" +
                    "    \"uvIndex\": 0,\n" +
                    "    \"visibility\": 9.49,\n" +
                    "    \"ozone\": 311.8\n" +
                    "  },\n" +
                    "  \"hourly\": {\n" +
                    "    \"summary\": \"Rain starting tonight, continuing until tomorrow morning.\",\n" +
                    "    \"icon\": \"rain\",\n" +
                    "    \"data\": [\n" +
                    "      {\n" +
                    "        \"time\": 1528675200,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0184,\n" +
                    "        \"precipProbability\": 0.26,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 74.47,\n" +
                    "        \"apparentTemperature\": 75.03,\n" +
                    "        \"dewPoint\": 65.07,\n" +
                    "        \"humidity\": 0.73,\n" +
                    "        \"pressure\": 1009.88,\n" +
                    "        \"windSpeed\": 7.1,\n" +
                    "        \"windGust\": 7.1,\n" +
                    "        \"windBearing\": 279,\n" +
                    "        \"cloudCover\": 0.49,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 9.87,\n" +
                    "        \"ozone\": 311.87\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528678800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.008,\n" +
                    "        \"precipProbability\": 0.36,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 72.44,\n" +
                    "        \"apparentTemperature\": 73.24,\n" +
                    "        \"dewPoint\": 66.63,\n" +
                    "        \"humidity\": 0.82,\n" +
                    "        \"pressure\": 1009.61,\n" +
                    "        \"windSpeed\": 5.68,\n" +
                    "        \"windGust\": 5.68,\n" +
                    "        \"windBearing\": 277,\n" +
                    "        \"cloudCover\": 0.73,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.68,\n" +
                    "        \"ozone\": 311.63\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528682400,\n" +
                    "        \"summary\": \"Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0367,\n" +
                    "        \"precipProbability\": 0.42,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 70.93,\n" +
                    "        \"apparentTemperature\": 71.91,\n" +
                    "        \"dewPoint\": 67.55,\n" +
                    "        \"humidity\": 0.89,\n" +
                    "        \"pressure\": 1009.83,\n" +
                    "        \"windSpeed\": 2.87,\n" +
                    "        \"windGust\": 4.36,\n" +
                    "        \"windBearing\": 314,\n" +
                    "        \"cloudCover\": 0.9,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.46,\n" +
                    "        \"ozone\": 311.16\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528686000,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.1139,\n" +
                    "        \"precipProbability\": 0.62,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 69.4,\n" +
                    "        \"apparentTemperature\": 70.47,\n" +
                    "        \"dewPoint\": 67.7,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.78,\n" +
                    "        \"windSpeed\": 2.72,\n" +
                    "        \"windGust\": 7.11,\n" +
                    "        \"windBearing\": 10,\n" +
                    "        \"cloudCover\": 0.9,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.77,\n" +
                    "        \"ozone\": 310.54\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528689600,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0684,\n" +
                    "        \"precipProbability\": 0.58,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 68.76,\n" +
                    "        \"apparentTemperature\": 69.77,\n" +
                    "        \"dewPoint\": 67.1,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.61,\n" +
                    "        \"windSpeed\": 1.3,\n" +
                    "        \"windGust\": 4.85,\n" +
                    "        \"windBearing\": 345,\n" +
                    "        \"cloudCover\": 0.94,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.16,\n" +
                    "        \"ozone\": 309.47\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528693200,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0678,\n" +
                    "        \"precipProbability\": 0.56,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 68.43,\n" +
                    "        \"apparentTemperature\": 69.42,\n" +
                    "        \"dewPoint\": 66.78,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.54,\n" +
                    "        \"windSpeed\": 3.37,\n" +
                    "        \"windGust\": 5.64,\n" +
                    "        \"windBearing\": 156,\n" +
                    "        \"cloudCover\": 0.87,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.54,\n" +
                    "        \"ozone\": 308.23\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"offset\": -4\n" +
                    "}";


    public static final String SUCCESSFUL_RESPONSE_48_HRS =
            "{\n" +
                    "  \"latitude\": 40.108963,\n" +
                    "  \"longitude\": -82.9605226,\n" +
                    "  \"timezone\": \"America/New_York\",\n" +
                    "  \"currently\": {\n" +
                    "    \"time\": 1528676333,\n" +
                    "    \"summary\": \"Partly Cloudy\",\n" +
                    "    \"icon\": \"partly-cloudy-day\",\n" +
                    "    \"nearestStormDistance\": 6,\n" +
                    "    \"nearestStormBearing\": 210,\n" +
                    "    \"precipIntensity\": 0,\n" +
                    "    \"precipProbability\": 0,\n" +
                    "    \"temperature\": 73.83,\n" +
                    "    \"apparentTemperature\": 74.47,\n" +
                    "    \"dewPoint\": 65.61,\n" +
                    "    \"humidity\": 0.76,\n" +
                    "    \"pressure\": 1009.8,\n" +
                    "    \"windSpeed\": 6.65,\n" +
                    "    \"windGust\": 6.65,\n" +
                    "    \"windBearing\": 279,\n" +
                    "    \"cloudCover\": 0.56,\n" +
                    "    \"uvIndex\": 0,\n" +
                    "    \"visibility\": 9.49,\n" +
                    "    \"ozone\": 311.8\n" +
                    "  },\n" +
                    "  \"hourly\": {\n" +
                    "    \"summary\": \"Rain starting tonight, continuing until tomorrow morning.\",\n" +
                    "    \"icon\": \"rain\",\n" +
                    "    \"data\": [\n" +
                    "      {\n" +
                    "        \"time\": 1528675200,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0184,\n" +
                    "        \"precipProbability\": 0.26,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 74.47,\n" +
                    "        \"apparentTemperature\": 75.03,\n" +
                    "        \"dewPoint\": 65.07,\n" +
                    "        \"humidity\": 0.73,\n" +
                    "        \"pressure\": 1009.88,\n" +
                    "        \"windSpeed\": 7.1,\n" +
                    "        \"windGust\": 7.1,\n" +
                    "        \"windBearing\": 279,\n" +
                    "        \"cloudCover\": 0.49,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 9.87,\n" +
                    "        \"ozone\": 311.87\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528678800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.008,\n" +
                    "        \"precipProbability\": 0.36,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 72.44,\n" +
                    "        \"apparentTemperature\": 73.24,\n" +
                    "        \"dewPoint\": 66.63,\n" +
                    "        \"humidity\": 0.82,\n" +
                    "        \"pressure\": 1009.61,\n" +
                    "        \"windSpeed\": 5.68,\n" +
                    "        \"windGust\": 5.68,\n" +
                    "        \"windBearing\": 277,\n" +
                    "        \"cloudCover\": 0.73,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.68,\n" +
                    "        \"ozone\": 311.63\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528682400,\n" +
                    "        \"summary\": \"Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0367,\n" +
                    "        \"precipProbability\": 0.42,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 70.93,\n" +
                    "        \"apparentTemperature\": 71.91,\n" +
                    "        \"dewPoint\": 67.55,\n" +
                    "        \"humidity\": 0.89,\n" +
                    "        \"pressure\": 1009.83,\n" +
                    "        \"windSpeed\": 2.87,\n" +
                    "        \"windGust\": 4.36,\n" +
                    "        \"windBearing\": 314,\n" +
                    "        \"cloudCover\": 0.9,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.46,\n" +
                    "        \"ozone\": 311.16\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528686000,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.1139,\n" +
                    "        \"precipProbability\": 0.62,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 69.4,\n" +
                    "        \"apparentTemperature\": 70.47,\n" +
                    "        \"dewPoint\": 67.7,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.78,\n" +
                    "        \"windSpeed\": 2.72,\n" +
                    "        \"windGust\": 7.11,\n" +
                    "        \"windBearing\": 10,\n" +
                    "        \"cloudCover\": 0.9,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.77,\n" +
                    "        \"ozone\": 310.54\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528689600,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0684,\n" +
                    "        \"precipProbability\": 0.58,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 68.76,\n" +
                    "        \"apparentTemperature\": 69.77,\n" +
                    "        \"dewPoint\": 67.1,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.61,\n" +
                    "        \"windSpeed\": 1.3,\n" +
                    "        \"windGust\": 4.85,\n" +
                    "        \"windBearing\": 345,\n" +
                    "        \"cloudCover\": 0.94,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.16,\n" +
                    "        \"ozone\": 309.47\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528693200,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0678,\n" +
                    "        \"precipProbability\": 0.56,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 68.43,\n" +
                    "        \"apparentTemperature\": 69.42,\n" +
                    "        \"dewPoint\": 66.78,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.54,\n" +
                    "        \"windSpeed\": 3.37,\n" +
                    "        \"windGust\": 5.64,\n" +
                    "        \"windBearing\": 156,\n" +
                    "        \"cloudCover\": 0.87,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.54,\n" +
                    "        \"ozone\": 308.23\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528696800,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.071,\n" +
                    "        \"precipProbability\": 0.55,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 68.29,\n" +
                    "        \"apparentTemperature\": 69.23,\n" +
                    "        \"dewPoint\": 66.49,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.25,\n" +
                    "        \"windSpeed\": 3.31,\n" +
                    "        \"windGust\": 5.6,\n" +
                    "        \"windBearing\": 82,\n" +
                    "        \"cloudCover\": 0.82,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.35,\n" +
                    "        \"ozone\": 307.07\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528700400,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0758,\n" +
                    "        \"precipProbability\": 0.57,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 68.12,\n" +
                    "        \"apparentTemperature\": 69.04,\n" +
                    "        \"dewPoint\": 66.28,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.15,\n" +
                    "        \"windSpeed\": 2.05,\n" +
                    "        \"windGust\": 6.85,\n" +
                    "        \"windBearing\": 149,\n" +
                    "        \"cloudCover\": 0.81,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.13,\n" +
                    "        \"ozone\": 306.22\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528704000,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.1116,\n" +
                    "        \"precipProbability\": 0.61,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 68.08,\n" +
                    "        \"apparentTemperature\": 68.98,\n" +
                    "        \"dewPoint\": 66.12,\n" +
                    "        \"humidity\": 0.93,\n" +
                    "        \"pressure\": 1009.28,\n" +
                    "        \"windSpeed\": 2.51,\n" +
                    "        \"windGust\": 8.08,\n" +
                    "        \"windBearing\": 123,\n" +
                    "        \"cloudCover\": 0.85,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 7.42,\n" +
                    "        \"ozone\": 305.53\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528707600,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.1627,\n" +
                    "        \"precipProbability\": 0.64,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 67.95,\n" +
                    "        \"apparentTemperature\": 68.83,\n" +
                    "        \"dewPoint\": 65.96,\n" +
                    "        \"humidity\": 0.93,\n" +
                    "        \"pressure\": 1009.42,\n" +
                    "        \"windSpeed\": 3.14,\n" +
                    "        \"windGust\": 9.37,\n" +
                    "        \"windBearing\": 168,\n" +
                    "        \"cloudCover\": 0.93,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.28,\n" +
                    "        \"ozone\": 304.79\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528711200,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.1017,\n" +
                    "        \"precipProbability\": 0.62,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 67.47,\n" +
                    "        \"apparentTemperature\": 68.34,\n" +
                    "        \"dewPoint\": 65.74,\n" +
                    "        \"humidity\": 0.94,\n" +
                    "        \"pressure\": 1009.77,\n" +
                    "        \"windSpeed\": 4.41,\n" +
                    "        \"windGust\": 10.82,\n" +
                    "        \"windBearing\": 179,\n" +
                    "        \"cloudCover\": 0.89,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.49,\n" +
                    "        \"ozone\": 303.94\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528714800,\n" +
                    "        \"summary\": \"Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0491,\n" +
                    "        \"precipProbability\": 0.5,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 67.1,\n" +
                    "        \"apparentTemperature\": 67.97,\n" +
                    "        \"dewPoint\": 65.57,\n" +
                    "        \"humidity\": 0.95,\n" +
                    "        \"pressure\": 1010.02,\n" +
                    "        \"windSpeed\": 4.56,\n" +
                    "        \"windGust\": 9.65,\n" +
                    "        \"windBearing\": 120,\n" +
                    "        \"cloudCover\": 0.89,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.71,\n" +
                    "        \"ozone\": 303\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528718400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0216,\n" +
                    "        \"precipProbability\": 0.32,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 66.97,\n" +
                    "        \"apparentTemperature\": 67.84,\n" +
                    "        \"dewPoint\": 65.5,\n" +
                    "        \"humidity\": 0.95,\n" +
                    "        \"pressure\": 1010.33,\n" +
                    "        \"windSpeed\": 5.01,\n" +
                    "        \"windGust\": 10.09,\n" +
                    "        \"windBearing\": 128,\n" +
                    "        \"cloudCover\": 0.88,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 7.16,\n" +
                    "        \"ozone\": 302.35\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528722000,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0134,\n" +
                    "        \"precipProbability\": 0.27,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 67.46,\n" +
                    "        \"apparentTemperature\": 68.27,\n" +
                    "        \"dewPoint\": 65.32,\n" +
                    "        \"humidity\": 0.93,\n" +
                    "        \"pressure\": 1010.81,\n" +
                    "        \"windSpeed\": 5.72,\n" +
                    "        \"windGust\": 10.2,\n" +
                    "        \"windBearing\": 114,\n" +
                    "        \"cloudCover\": 0.96,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 7.66,\n" +
                    "        \"ozone\": 302.16\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528725600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0155,\n" +
                    "        \"precipProbability\": 0.32,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 67.9,\n" +
                    "        \"apparentTemperature\": 68.69,\n" +
                    "        \"dewPoint\": 65.27,\n" +
                    "        \"humidity\": 0.91,\n" +
                    "        \"pressure\": 1011.2,\n" +
                    "        \"windSpeed\": 7.3,\n" +
                    "        \"windGust\": 11.89,\n" +
                    "        \"windBearing\": 79,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 9.91,\n" +
                    "        \"ozone\": 302.07\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528729200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0135,\n" +
                    "        \"precipProbability\": 0.29,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 68.87,\n" +
                    "        \"apparentTemperature\": 69.6,\n" +
                    "        \"dewPoint\": 65.23,\n" +
                    "        \"humidity\": 0.88,\n" +
                    "        \"pressure\": 1011.46,\n" +
                    "        \"windSpeed\": 8.41,\n" +
                    "        \"windGust\": 12.15,\n" +
                    "        \"windBearing\": 72,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 301.97\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528732800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0101,\n" +
                    "        \"precipProbability\": 0.22,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 70.04,\n" +
                    "        \"apparentTemperature\": 70.75,\n" +
                    "        \"dewPoint\": 65.43,\n" +
                    "        \"humidity\": 0.85,\n" +
                    "        \"pressure\": 1011.56,\n" +
                    "        \"windSpeed\": 9.12,\n" +
                    "        \"windGust\": 13.6,\n" +
                    "        \"windBearing\": 72,\n" +
                    "        \"cloudCover\": 0.95,\n" +
                    "        \"uvIndex\": 5,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 301.64\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528736400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0079,\n" +
                    "        \"precipProbability\": 0.17,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 71.37,\n" +
                    "        \"apparentTemperature\": 72.08,\n" +
                    "        \"dewPoint\": 65.76,\n" +
                    "        \"humidity\": 0.83,\n" +
                    "        \"pressure\": 1011.58,\n" +
                    "        \"windSpeed\": 9.7,\n" +
                    "        \"windGust\": 15.55,\n" +
                    "        \"windBearing\": 83,\n" +
                    "        \"cloudCover\": 0.89,\n" +
                    "        \"uvIndex\": 7,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 301.27\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528740000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0075,\n" +
                    "        \"precipProbability\": 0.15,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 72.7,\n" +
                    "        \"apparentTemperature\": 73.41,\n" +
                    "        \"dewPoint\": 66.02,\n" +
                    "        \"humidity\": 0.8,\n" +
                    "        \"pressure\": 1011.62,\n" +
                    "        \"windSpeed\": 10.11,\n" +
                    "        \"windGust\": 17.04,\n" +
                    "        \"windBearing\": 92,\n" +
                    "        \"cloudCover\": 0.82,\n" +
                    "        \"uvIndex\": 7,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 301.03\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528743600,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0076,\n" +
                    "        \"precipProbability\": 0.15,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 74.18,\n" +
                    "        \"apparentTemperature\": 74.88,\n" +
                    "        \"dewPoint\": 66.17,\n" +
                    "        \"humidity\": 0.76,\n" +
                    "        \"pressure\": 1011.51,\n" +
                    "        \"windSpeed\": 10.19,\n" +
                    "        \"windGust\": 17.79,\n" +
                    "        \"windBearing\": 97,\n" +
                    "        \"cloudCover\": 0.84,\n" +
                    "        \"uvIndex\": 6,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 300.87\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528747200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0085,\n" +
                    "        \"precipProbability\": 0.16,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 75.29,\n" +
                    "        \"apparentTemperature\": 75.97,\n" +
                    "        \"dewPoint\": 66.25,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1011.51,\n" +
                    "        \"windSpeed\": 10.18,\n" +
                    "        \"windGust\": 18.15,\n" +
                    "        \"windBearing\": 100,\n" +
                    "        \"cloudCover\": 0.91,\n" +
                    "        \"uvIndex\": 4,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 300.9\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528750800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0092,\n" +
                    "        \"precipProbability\": 0.14,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 75.64,\n" +
                    "        \"apparentTemperature\": 76.33,\n" +
                    "        \"dewPoint\": 66.26,\n" +
                    "        \"humidity\": 0.73,\n" +
                    "        \"pressure\": 1011.71,\n" +
                    "        \"windSpeed\": 10.21,\n" +
                    "        \"windGust\": 18.09,\n" +
                    "        \"windBearing\": 102,\n" +
                    "        \"cloudCover\": 0.93,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 301.35\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528754400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0075,\n" +
                    "        \"precipProbability\": 0.11,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 75.75,\n" +
                    "        \"apparentTemperature\": 76.44,\n" +
                    "        \"dewPoint\": 66.26,\n" +
                    "        \"humidity\": 0.72,\n" +
                    "        \"pressure\": 1011.9,\n" +
                    "        \"windSpeed\": 10.1,\n" +
                    "        \"windGust\": 17.38,\n" +
                    "        \"windBearing\": 102,\n" +
                    "        \"cloudCover\": 0.93,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 302.69\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528758000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0055,\n" +
                    "        \"precipProbability\": 0.08,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 74.62,\n" +
                    "        \"apparentTemperature\": 75.31,\n" +
                    "        \"dewPoint\": 66.2,\n" +
                    "        \"humidity\": 0.75,\n" +
                    "        \"pressure\": 1012.14,\n" +
                    "        \"windSpeed\": 9.75,\n" +
                    "        \"windGust\": 16.27,\n" +
                    "        \"windBearing\": 100,\n" +
                    "        \"cloudCover\": 0.9,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 304.46\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528761600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.004,\n" +
                    "        \"precipProbability\": 0.06,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 72.75,\n" +
                    "        \"apparentTemperature\": 73.44,\n" +
                    "        \"dewPoint\": 65.89,\n" +
                    "        \"humidity\": 0.79,\n" +
                    "        \"pressure\": 1012.44,\n" +
                    "        \"windSpeed\": 9.31,\n" +
                    "        \"windGust\": 15.62,\n" +
                    "        \"windBearing\": 99,\n" +
                    "        \"cloudCover\": 0.95,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 305.86\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528765200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0017,\n" +
                    "        \"precipProbability\": 0.04,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 71,\n" +
                    "        \"apparentTemperature\": 71.65,\n" +
                    "        \"dewPoint\": 65.17,\n" +
                    "        \"humidity\": 0.82,\n" +
                    "        \"pressure\": 1012.93,\n" +
                    "        \"windSpeed\": 9.1,\n" +
                    "        \"windGust\": 15.94,\n" +
                    "        \"windBearing\": 99,\n" +
                    "        \"cloudCover\": 0.93,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 306.64\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528768800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0004,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 69.42,\n" +
                    "        \"apparentTemperature\": 69.99,\n" +
                    "        \"dewPoint\": 64.21,\n" +
                    "        \"humidity\": 0.84,\n" +
                    "        \"pressure\": 1013.46,\n" +
                    "        \"windSpeed\": 9.05,\n" +
                    "        \"windGust\": 16.72,\n" +
                    "        \"windBearing\": 104,\n" +
                    "        \"cloudCover\": 0.91,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 307.19\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528772400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 68.2,\n" +
                    "        \"apparentTemperature\": 68.68,\n" +
                    "        \"dewPoint\": 63.33,\n" +
                    "        \"humidity\": 0.84,\n" +
                    "        \"pressure\": 1013.77,\n" +
                    "        \"windSpeed\": 8.99,\n" +
                    "        \"windGust\": 17.35,\n" +
                    "        \"windBearing\": 108,\n" +
                    "        \"cloudCover\": 0.85,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 307.37\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528776000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 67.26,\n" +
                    "        \"apparentTemperature\": 67.68,\n" +
                    "        \"dewPoint\": 62.57,\n" +
                    "        \"humidity\": 0.85,\n" +
                    "        \"pressure\": 1014.07,\n" +
                    "        \"windSpeed\": 8.69,\n" +
                    "        \"windGust\": 17.5,\n" +
                    "        \"windBearing\": 112,\n" +
                    "        \"cloudCover\": 0.77,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 307.22\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528779600,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 66.38,\n" +
                    "        \"apparentTemperature\": 66.73,\n" +
                    "        \"dewPoint\": 61.84,\n" +
                    "        \"humidity\": 0.85,\n" +
                    "        \"pressure\": 1014.27,\n" +
                    "        \"windSpeed\": 8.48,\n" +
                    "        \"windGust\": 17.49,\n" +
                    "        \"windBearing\": 111,\n" +
                    "        \"cloudCover\": 0.7,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 306.86\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528783200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0002,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 65.66,\n" +
                    "        \"apparentTemperature\": 65.96,\n" +
                    "        \"dewPoint\": 61.27,\n" +
                    "        \"humidity\": 0.86,\n" +
                    "        \"pressure\": 1014.44,\n" +
                    "        \"windSpeed\": 8.57,\n" +
                    "        \"windGust\": 17.68,\n" +
                    "        \"windBearing\": 111,\n" +
                    "        \"cloudCover\": 0.66,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 306.48\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528786800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0004,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 64.8,\n" +
                    "        \"apparentTemperature\": 65.08,\n" +
                    "        \"dewPoint\": 60.85,\n" +
                    "        \"humidity\": 0.87,\n" +
                    "        \"pressure\": 1014.42,\n" +
                    "        \"windSpeed\": 8.76,\n" +
                    "        \"windGust\": 18.36,\n" +
                    "        \"windBearing\": 110,\n" +
                    "        \"cloudCover\": 0.7,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 306.05\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528790400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0011,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 64.11,\n" +
                    "        \"apparentTemperature\": 64.38,\n" +
                    "        \"dewPoint\": 60.59,\n" +
                    "        \"humidity\": 0.88,\n" +
                    "        \"pressure\": 1014.4,\n" +
                    "        \"windSpeed\": 8.94,\n" +
                    "        \"windGust\": 19.25,\n" +
                    "        \"windBearing\": 112,\n" +
                    "        \"cloudCover\": 0.7,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 305.68\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528794000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0019,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 63.78,\n" +
                    "        \"apparentTemperature\": 64.05,\n" +
                    "        \"dewPoint\": 60.53,\n" +
                    "        \"humidity\": 0.89,\n" +
                    "        \"pressure\": 1014.48,\n" +
                    "        \"windSpeed\": 8.86,\n" +
                    "        \"windGust\": 19.89,\n" +
                    "        \"windBearing\": 115,\n" +
                    "        \"cloudCover\": 0.7,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 305.7\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528797600,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0027,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 63.73,\n" +
                    "        \"apparentTemperature\": 64.03,\n" +
                    "        \"dewPoint\": 60.72,\n" +
                    "        \"humidity\": 0.9,\n" +
                    "        \"pressure\": 1014.57,\n" +
                    "        \"windSpeed\": 8.92,\n" +
                    "        \"windGust\": 19.99,\n" +
                    "        \"windBearing\": 120,\n" +
                    "        \"cloudCover\": 0.72,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 306.68\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528801200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0009,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 63.96,\n" +
                    "        \"apparentTemperature\": 64.32,\n" +
                    "        \"dewPoint\": 61.15,\n" +
                    "        \"humidity\": 0.91,\n" +
                    "        \"pressure\": 1014.72,\n" +
                    "        \"windSpeed\": 9.24,\n" +
                    "        \"windGust\": 19.8,\n" +
                    "        \"windBearing\": 128,\n" +
                    "        \"cloudCover\": 0.74,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 307.94\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528804800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 65.05,\n" +
                    "        \"apparentTemperature\": 65.44,\n" +
                    "        \"dewPoint\": 61.72,\n" +
                    "        \"humidity\": 0.89,\n" +
                    "        \"pressure\": 1014.72,\n" +
                    "        \"windSpeed\": 9.78,\n" +
                    "        \"windGust\": 19.62,\n" +
                    "        \"windBearing\": 136,\n" +
                    "        \"cloudCover\": 0.77,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 308.77\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528808400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0002,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 66.72,\n" +
                    "        \"apparentTemperature\": 67.14,\n" +
                    "        \"dewPoint\": 62.44,\n" +
                    "        \"humidity\": 0.86,\n" +
                    "        \"pressure\": 1014.66,\n" +
                    "        \"windSpeed\": 10.21,\n" +
                    "        \"windGust\": 19.67,\n" +
                    "        \"windBearing\": 146,\n" +
                    "        \"cloudCover\": 0.82,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 308.7\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528812000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0011,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 69.02,\n" +
                    "        \"apparentTemperature\": 69.47,\n" +
                    "        \"dewPoint\": 63.27,\n" +
                    "        \"humidity\": 0.82,\n" +
                    "        \"pressure\": 1014.48,\n" +
                    "        \"windSpeed\": 10.26,\n" +
                    "        \"windGust\": 19.75,\n" +
                    "        \"windBearing\": 158,\n" +
                    "        \"cloudCover\": 0.93,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 308.09\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528815600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0025,\n" +
                    "        \"precipProbability\": 0.04,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 70.79,\n" +
                    "        \"apparentTemperature\": 71.3,\n" +
                    "        \"dewPoint\": 64.1,\n" +
                    "        \"humidity\": 0.79,\n" +
                    "        \"pressure\": 1014.25,\n" +
                    "        \"windSpeed\": 10.1,\n" +
                    "        \"windGust\": 19.6,\n" +
                    "        \"windBearing\": 167,\n" +
                    "        \"cloudCover\": 0.98,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 307.12\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528819200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0024,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 71.77,\n" +
                    "        \"apparentTemperature\": 72.36,\n" +
                    "        \"dewPoint\": 64.9,\n" +
                    "        \"humidity\": 0.79,\n" +
                    "        \"pressure\": 1014.08,\n" +
                    "        \"windSpeed\": 9.78,\n" +
                    "        \"windGust\": 19.07,\n" +
                    "        \"windBearing\": 169,\n" +
                    "        \"cloudCover\": 0.98,\n" +
                    "        \"uvIndex\": 5,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 305.48\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528822800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.002,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 73.17,\n" +
                    "        \"apparentTemperature\": 73.83,\n" +
                    "        \"dewPoint\": 65.72,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1013.77,\n" +
                    "        \"windSpeed\": 9.64,\n" +
                    "        \"windGust\": 18.34,\n" +
                    "        \"windBearing\": 165,\n" +
                    "        \"cloudCover\": 0.94,\n" +
                    "        \"uvIndex\": 6,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 303.46\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528826400,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0036,\n" +
                    "        \"precipProbability\": 0.05,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 74.73,\n" +
                    "        \"apparentTemperature\": 75.46,\n" +
                    "        \"dewPoint\": 66.53,\n" +
                    "        \"humidity\": 0.76,\n" +
                    "        \"pressure\": 1013.29,\n" +
                    "        \"windSpeed\": 9.16,\n" +
                    "        \"windGust\": 17.79,\n" +
                    "        \"windBearing\": 170,\n" +
                    "        \"cloudCover\": 0.94,\n" +
                    "        \"uvIndex\": 6,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 301.71\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528830000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0122,\n" +
                    "        \"precipProbability\": 0.1,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 76.31,\n" +
                    "        \"apparentTemperature\": 77.12,\n" +
                    "        \"dewPoint\": 67.42,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1012.6,\n" +
                    "        \"windSpeed\": 8.71,\n" +
                    "        \"windGust\": 17.64,\n" +
                    "        \"windBearing\": 173,\n" +
                    "        \"cloudCover\": 0.89,\n" +
                    "        \"uvIndex\": 5,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 300.21\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528833600,\n" +
                    "        \"summary\": \"Possible Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0336,\n" +
                    "        \"precipProbability\": 0.21,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 77.96,\n" +
                    "        \"apparentTemperature\": 78.86,\n" +
                    "        \"dewPoint\": 68.33,\n" +
                    "        \"humidity\": 0.72,\n" +
                    "        \"pressure\": 1011.86,\n" +
                    "        \"windSpeed\": 8.59,\n" +
                    "        \"windGust\": 17.71,\n" +
                    "        \"windBearing\": 175,\n" +
                    "        \"cloudCover\": 0.79,\n" +
                    "        \"uvIndex\": 4,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 298.93\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528837200,\n" +
                    "        \"summary\": \"Possible Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.05,\n" +
                    "        \"precipProbability\": 0.28,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 79.01,\n" +
                    "        \"apparentTemperature\": 79.97,\n" +
                    "        \"dewPoint\": 69.01,\n" +
                    "        \"humidity\": 0.72,\n" +
                    "        \"pressure\": 1011.3,\n" +
                    "        \"windSpeed\": 8.57,\n" +
                    "        \"windGust\": 17.58,\n" +
                    "        \"windBearing\": 179,\n" +
                    "        \"cloudCover\": 0.71,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 8.73,\n" +
                    "        \"ozone\": 297.9\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528840800,\n" +
                    "        \"summary\": \"Possible Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0431,\n" +
                    "        \"precipProbability\": 0.25,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 79.8,\n" +
                    "        \"apparentTemperature\": 82.72,\n" +
                    "        \"dewPoint\": 69.42,\n" +
                    "        \"humidity\": 0.71,\n" +
                    "        \"pressure\": 1011.02,\n" +
                    "        \"windSpeed\": 8.21,\n" +
                    "        \"windGust\": 17.19,\n" +
                    "        \"windBearing\": 185,\n" +
                    "        \"cloudCover\": 0.67,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 8.28,\n" +
                    "        \"ozone\": 297.01\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528844400,\n" +
                    "        \"summary\": \"Possible Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0428,\n" +
                    "        \"precipProbability\": 0.24,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 79.18,\n" +
                    "        \"apparentTemperature\": 81.9,\n" +
                    "        \"dewPoint\": 69.58,\n" +
                    "        \"humidity\": 0.73,\n" +
                    "        \"pressure\": 1010.73,\n" +
                    "        \"windSpeed\": 7.76,\n" +
                    "        \"windGust\": 16.61,\n" +
                    "        \"windBearing\": 187,\n" +
                    "        \"cloudCover\": 0.89,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 8.52,\n" +
                    "        \"ozone\": 296.28\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1528848000,\n" +
                    "        \"summary\": \"Possible Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0509,\n" +
                    "        \"precipProbability\": 0.28,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 77.23,\n" +
                    "        \"apparentTemperature\": 78.28,\n" +
                    "        \"dewPoint\": 69.5,\n" +
                    "        \"humidity\": 0.77,\n" +
                    "        \"pressure\": 1010.77,\n" +
                    "        \"windSpeed\": 7.47,\n" +
                    "        \"windGust\": 15.71,\n" +
                    "        \"windBearing\": 186,\n" +
                    "        \"cloudCover\": 0.97,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.99,\n" +
                    "        \"ozone\": 295.92\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"offset\": -4\n" +
                    "}";
}
