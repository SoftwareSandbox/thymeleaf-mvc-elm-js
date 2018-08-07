module Codes exposing (..)

import Html exposing (..)


type alias Model =
    { selectedCountryCode : CountryCode }


type alias Flags =
    { selectedCountryCode : Maybe CountryCode
    , cityCode : Maybe CityCode
    }


type alias CountryCode =
    String


type alias CityCode =
    String


type Msg
    = Noop


init : Flags -> ( Model, Cmd Msg )
init flags =
    ( Model "bleh", Cmd.none )


main : Program Flags Model Msg
main =
    Html.programWithFlags
        { init = init
        , view = view
        , update = update
        , subscriptions = (\_ -> Sub.none)
        }


view : Model -> Html Msg
view model =
    div [] []


update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
    ( model, Cmd.none )
