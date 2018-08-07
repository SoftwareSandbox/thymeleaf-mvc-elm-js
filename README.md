# thymeleaf-mvc-elm-js
Example on how to use ThymeLeaf + WebMVC to create an Elm component that interacts with an existing vanilla JS component

The example is two _select_'s, of which the content of the second is decided depending on the selection of the first _select_.

Depending on added data that was added, the content of the first _select_ is decided.

## TODO

* [ ] Create a REST Controller to provide data to fill in the first and second selects. (with filter criteria)
* [ ] Learn how to use `ProgramWithFlags` to kickstart an Elm component with initial data from outside the Elm runtime.
* [ ] Learn how to interop with an existing JS component (`Port`s)
    * [ ] Since we're using this on my current project, we'll use this [WebUniversum's Select with Remote Datasource](https://overheid.vlaanderen.be/webuniversum/webcomponenten-versie-2#select-remote-datasource) component.