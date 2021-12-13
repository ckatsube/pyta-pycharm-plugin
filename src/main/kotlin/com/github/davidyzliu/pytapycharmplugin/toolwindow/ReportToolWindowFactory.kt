package com.github.davidyzliu.pytapycharmplugin.toolwindow

import com.github.davidyzliu.pytapycharmplugin.utils.PytaIssue
import com.github.davidyzliu.pytapycharmplugin.utils.PytaPluginUtils
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class ReportToolWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(p0: Project, p1: ToolWindow) {
        val tw = ReportToolWindow()
//        tw.replaceContent(buildPyTaIssue())
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(tw.getContent(), "Some Test Text", false)
        p1.contentManager.addContent(content)
    }

    private fun buildPyTaIssue(): List<PytaIssue> {

        return PytaPluginUtils.parsePytaOutputString(
            "[\n" +
                    "    {\n" +
                    "        \"filename\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "        \"msgs\": [\n" +
                    "            {\n" +
                    "                \"msg_id\": \"C0301\",\n" +
                    "                \"symbol\": \"line-too-long\",\n" +
                    "                \"msg\": \"This line is 84 characters long, exceeding the limit of 80 characters.\",\n" +
                    "                \"C\": \"C\",\n" +
                    "                \"category\": \"convention\",\n" +
                    "                \"confidence\": [\n" +
                    "                    \"UNDEFINED\",\n" +
                    "                    \"Warning without any associated confidence level.\"\n" +
                    "                ],\n" +
                    "                \"abspath\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "                \"path\": \"sandbox.py\",\n" +
                    "                \"module\": \"sandbox\",\n" +
                    "                \"obj\": \"\",\n" +
                    "                \"line\": 17,\n" +
                    "                \"column\": 0,\n" +
                    "                \"node\": null,\n" +
                    "                \"snippet\": \"   15  #         contents = file.read()\\n   16  #     # file_ast = RedBaron(contents)\\n   17  #     # file_ast[11].find('if').value[0].insert_before('import python_ta.contracts')\\n   18  #     # file_ast[11].find('if').value[1].insert_before('python_ta.contracts.check_all_contracts()')\\n   19  #     file_ast: astroid.Module = astroid.parse(contents)\\n\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"msg_id\": \"C0301\",\n" +
                    "                \"symbol\": \"line-too-long\",\n" +
                    "                \"msg\": \"This line is 99 characters long, exceeding the limit of 80 characters.\",\n" +
                    "                \"C\": \"C\",\n" +
                    "                \"category\": \"convention\",\n" +
                    "                \"confidence\": [\n" +
                    "                    \"UNDEFINED\",\n" +
                    "                    \"Warning without any associated confidence level.\"\n" +
                    "                ],\n" +
                    "                \"abspath\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "                \"path\": \"sandbox.py\",\n" +
                    "                \"module\": \"sandbox\",\n" +
                    "                \"obj\": \"\",\n" +
                    "                \"line\": 18,\n" +
                    "                \"column\": 0,\n" +
                    "                \"node\": null,\n" +
                    "                \"snippet\": \"   16  #     # file_ast = RedBaron(contents)\\n   17  #     # file_ast[11].find('if').value[0].insert_before('import python_ta.contracts')\\n   18  #     # file_ast[11].find('if').value[1].insert_before('python_ta.contracts.check_all_contracts()')\\n   19  #     file_ast: astroid.Module = astroid.parse(contents)\\n   20  #     import_statement = raw_building.build_from_import('python_ta', ('contracts',))\\n\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"msg_id\": \"C0301\",\n" +
                    "                \"symbol\": \"line-too-long\",\n" +
                    "                \"msg\": \"This line is 84 characters long, exceeding the limit of 80 characters.\",\n" +
                    "                \"C\": \"C\",\n" +
                    "                \"category\": \"convention\",\n" +
                    "                \"confidence\": [\n" +
                    "                    \"UNDEFINED\",\n" +
                    "                    \"Warning without any associated confidence level.\"\n" +
                    "                ],\n" +
                    "                \"abspath\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "                \"path\": \"sandbox.py\",\n" +
                    "                \"module\": \"sandbox\",\n" +
                    "                \"obj\": \"\",\n" +
                    "                \"line\": 20,\n" +
                    "                \"column\": 0,\n" +
                    "                \"node\": null,\n" +
                    "                \"snippet\": \"   18  #     # file_ast[11].find('if').value[1].insert_before('python_ta.contracts.check_all_contracts()')\\n   19  #     file_ast: astroid.Module = astroid.parse(contents)\\n   20  #     import_statement = raw_building.build_from_import('python_ta', ('contracts',))\\n   21  #     if_nodes: tuple[astroid.If] = file_ast.nodes_of_class(astroid.If)\\n   22  #     if_main = next(node for node in if_nodes if node.test.as_string() == \\\"__name__ == '__main__'\\\")\\n\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"msg_id\": \"C0301\",\n" +
                    "                \"symbol\": \"line-too-long\",\n" +
                    "                \"msg\": \"This line is 100 characters long, exceeding the limit of 80 characters.\",\n" +
                    "                \"C\": \"C\",\n" +
                    "                \"category\": \"convention\",\n" +
                    "                \"confidence\": [\n" +
                    "                    \"UNDEFINED\",\n" +
                    "                    \"Warning without any associated confidence level.\"\n" +
                    "                ],\n" +
                    "                \"abspath\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "                \"path\": \"sandbox.py\",\n" +
                    "                \"module\": \"sandbox\",\n" +
                    "                \"obj\": \"\",\n" +
                    "                \"line\": 22,\n" +
                    "                \"column\": 0,\n" +
                    "                \"node\": null,\n" +
                    "                \"snippet\": \"   20  #     import_statement = raw_building.build_from_import('python_ta', ('contracts',))\\n   21  #     if_nodes: tuple[astroid.If] = file_ast.nodes_of_class(astroid.If)\\n   22  #     if_main = next(node for node in if_nodes if node.test.as_string() == \\\"__name__ == '__main__'\\\")\\n   23  #     if_main.body.insert(0, import_statement)\\n   24  #     new_file_contents = file_ast.as_string()\\n\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"msg_id\": \"C0103\",\n" +
                    "                \"symbol\": \"invalid-name\",\n" +
                    "                \"msg\": \"Constant name \\\"a\\\" doesn't conform to '(([A-Z_][A-Z0-9_]*)|(__.*__))\$' pattern. Please refer to the PyTA Help Documentation for more information on Python naming conventions.\",\n" +
                    "                \"C\": \"C\",\n" +
                    "                \"category\": \"convention\",\n" +
                    "                \"confidence\": [\n" +
                    "                    \"HIGH\",\n" +
                    "                    \"No false positive possible.\"\n" +
                    "                ],\n" +
                    "                \"abspath\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "                \"path\": \"sandbox.py\",\n" +
                    "                \"module\": \"sandbox\",\n" +
                    "                \"obj\": \"\",\n" +
                    "                \"line\": 8,\n" +
                    "                \"column\": 0,\n" +
                    "                \"node\": null,\n" +
                    "                \"snippet\": \"\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"msg_id\": \"E9997\",\n" +
                    "                \"symbol\": \"forbidden-global-variables\",\n" +
                    "                \"msg\": \"Global variables must be constants in CSC108/CSC148: a global variable 'a' is assigned to on line 8\",\n" +
                    "                \"C\": \"E\",\n" +
                    "                \"category\": \"error\",\n" +
                    "                \"confidence\": [\n" +
                    "                    \"UNDEFINED\",\n" +
                    "                    \"Warning without any associated confidence level.\"\n" +
                    "                ],\n" +
                    "                \"abspath\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "                \"path\": \"sandbox.py\",\n" +
                    "                \"module\": \"sandbox\",\n" +
                    "                \"obj\": \"\",\n" +
                    "                \"line\": 8,\n" +
                    "                \"column\": 0,\n" +
                    "                \"node\": null,\n" +
                    "                \"snippet\": \"    6  # from redbaron import RedBaron\\n    7  \\n    8  a = 10  # this is a comment\\n    9  \\n   10  b = 10\\n\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"msg_id\": \"C0103\",\n" +
                    "                \"symbol\": \"invalid-name\",\n" +
                    "                \"msg\": \"Constant name \\\"b\\\" doesn't conform to '(([A-Z_][A-Z0-9_]*)|(__.*__))\$' pattern. Please refer to the PyTA Help Documentation for more information on Python naming conventions.\",\n" +
                    "                \"C\": \"C\",\n" +
                    "                \"category\": \"convention\",\n" +
                    "                \"confidence\": [\n" +
                    "                    \"HIGH\",\n" +
                    "                    \"No false positive possible.\"\n" +
                    "                ],\n" +
                    "                \"abspath\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "                \"path\": \"sandbox.py\",\n" +
                    "                \"module\": \"sandbox\",\n" +
                    "                \"obj\": \"\",\n" +
                    "                \"line\": 10,\n" +
                    "                \"column\": 0,\n" +
                    "                \"node\": null,\n" +
                    "                \"snippet\": \"\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"msg_id\": \"E9997\",\n" +
                    "                \"symbol\": \"forbidden-global-variables\",\n" +
                    "                \"msg\": \"Global variables must be constants in CSC108/CSC148: a global variable 'b' is assigned to on line 10\",\n" +
                    "                \"C\": \"E\",\n" +
                    "                \"category\": \"error\",\n" +
                    "                \"confidence\": [\n" +
                    "                    \"UNDEFINED\",\n" +
                    "                    \"Warning without any associated confidence level.\"\n" +
                    "                ],\n" +
                    "                \"abspath\": \"C:\\\\Programming\\\\Python\\\\PycharmProjects\\\\testingEnvironment\\\\sandbox.py\",\n" +
                    "                \"path\": \"sandbox.py\",\n" +
                    "                \"module\": \"sandbox\",\n" +
                    "                \"obj\": \"\",\n" +
                    "                \"line\": 10,\n" +
                    "                \"column\": 0,\n" +
                    "                \"node\": null,\n" +
                    "                \"snippet\": \"    8  a = 10  # this is a comment\\n    9  \\n   10  b = 10\\n   11  \\n   12  \\n\"\n" +
                    "            }\n" +
                    "        ]\n" +
                    "    }\n" +
                    "]\n"
        )
    }
}