# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The rosee_msg package"
AUTHOR = "Luca Muratore <luca.muratore@iit.it>"
ROS_AUTHOR = "Luca Muratore <luca.muratore@iit.it>"
HOMEPAGE = "https://advrhumanoids.github.io/ROSEndEffectorDocs/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "rosee_msg"
ROS_BPN = "rosee_msg"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    geometry-msgs \
    message-generation \
    roscpp \
    rospy \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    message-generation \
    message-runtime \
    roscpp \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ADVRHumanoids/rosee_msg-release/archive/release/noetic/rosee_msg/1.0.2-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosee_msg"
SRC_URI = "git://github.com/ADVRHumanoids/rosee_msg-release;${ROS_BRANCH};protocol=https"
SRCREV = "b9f985fa6d7e2bdb3103709dc24bd4c7148e8b3d"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
