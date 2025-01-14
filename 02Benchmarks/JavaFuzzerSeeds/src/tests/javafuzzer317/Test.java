package tests.javafuzzer317;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:44:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public static double dFld=-24.57869;
    public static short sFld=-31815;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 96);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d, double d1) {

        int i4=-37462, i5=-12, i6=-55, i7=21;
        float f1=-69.366F;
        short s1=13028;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -966L);

        Test.iArrFld[(i4 >>> 1) % N] = i4;
        Test.instanceCount = i4;
        i4 = -13890;
        i5 = 1;
        while ((i5 += 3) < 292) {
            if (i5 != 0) {
            }
            i4 += (i5 * i4);
            i6 = 16;
            while ((i6 -= 3) > 0) {
                switch ((i6 % 9) + 94) {
                case 94:
                    i4 = (int)1.868F;
                    i7 = 1;
                    while (++i7 < 3) {
                        i4 += (int)Test.instanceCount;
                        i4 = 7;
                        Test.instanceCount += (((i7 * i7) + i4) - i4);
                    }
                    Test.instanceCount = i6;
                    i4 |= i6;
                    break;
                case 95:
                    i4 >>= i5;
                    break;
                case 96:
                    lArr[i6][i6 + 1] += i6;
                    break;
                case 97:
                    f1 += (i6 * i6);
                case 98:
                    i4 = i6;
                    break;
                case 99:
                    i4 = (int)Test.instanceCount;
                    break;
                case 100:
                    i4 >>>= s1;
                    break;
                case 101:
                    i4 %= (int)(i6 | 1);
                    break;
                case 102:
                    i4 *= i6;
                default:
                    d1 += i7;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 +
            Float.floatToIntBits(f1) + s1 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i3=-57, i8=-50444, i9=-56821, i10=-3;
        float f2=0.948F, f3=2.17F, fArr[]=new float[N];
        boolean b=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(fArr, -1.392F);
        FuzzerUtils.init(sArr, (short)-14231);

        i3 += (iMeth(Test.dFld, Test.dFld) * -3);
        f2 = 1;
        while (++f2 < 127) {
            for (i8 = 1; 12 > i8; ++i8) {
                Test.iArrFld[(int)(f2)] -= i9;
                Test.dFld *= f2;
                i3 = i3;
            }
            for (f3 = f2; f3 < 12; f3++) {
                i3 -= -10;
                Test.sFld >>= (short)i10;
                i10 = (int)Test.instanceCount;
                fArr[(int)(f3 - 1)] = 51.539F;
                sArr[(int)(f3 - 1)] += (short)i8;
                if (b) {
                    b = b;
                }
                Test.sFld += (short)f3;
            }
        }
        vMeth1_check_sum += i3 + Float.floatToIntBits(f2) + i8 + i9 + Float.floatToIntBits(f3) + i10 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(byte by, int i) {

        short s=-16996;
        float f=1.1012F, fArr1[]=new float[N];
        int i1=11, i2=-39299, i11=-40, i12=-11, i13=5, i14=-2;

        FuzzerUtils.init(fArr1, -116.547F);

        i = (int)(-Test.instanceCount);
        s *= (short)(f * i);
        for (i1 = 305; i1 > 19; i1 -= 2) {
            vMeth1();
            i2 = s;
            for (i11 = i1; i11 < 11; i11++) {
                i12 |= (int)3728577651381369484L;
                for (i13 = 1; i13 < 1; ++i13) {
                    boolean b1=false;
                    s = s;
                    if (b1) {
                        i2 >>= i11;
                    }
                    b1 = b1;
                    i |= -4;
                    Test.instanceCount *= Test.instanceCount;
                }
                fArr1[i11] -= i12;
            }
        }
        vMeth_check_sum += by + i + s + Float.floatToIntBits(f) + i1 + i2 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i15=-25781;

        vMeth((byte)(-61), i15);



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
