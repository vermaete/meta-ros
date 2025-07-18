# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package provides a script that launches Emacs with Slime (the     Superior Lisp Interaction Mode) ready for Lisp development and     roslisp."
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
ROS_AUTHOR = "Lorenz Moesenlechner"
HOMEPAGE = "https://github.com/code-iai/ros_emacs_utils"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Public domain"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=90cf8e14bb501c1f6d3eda81e45e438a"

ROS_CN = "ros_emacs_utils"
ROS_BPN = "roslisp_repl"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-sbcl} \
    rosemacs \
    roslisp \
    slime-ros \
    slime-wrapper \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-sbcl} \
    rosemacs \
    roslisp \
    slime-ros \
    slime-wrapper \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/noetic/roslisp_repl/0.4.18-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/roslisp_repl"
SRC_URI = "git://github.com/code-iai-release/ros_emacs_utils-release;${ROS_BRANCH};protocol=https"
SRCREV = "eed7d523d64be19653e84499601c3d19b8c78cd3"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
