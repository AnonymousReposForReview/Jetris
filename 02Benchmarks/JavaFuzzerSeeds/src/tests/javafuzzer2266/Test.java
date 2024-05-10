package tests.javafuzzer2266;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:06:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=323727021296144925L;
    public static float fFld=-2.816F;
    public static volatile double dFld=0.89308;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d1, long l1, boolean b) {

        int i9=53640, i10=11484, i11=-47048, i12=65469;
        short s2=-3486;

        for (i9 = 5; 141 > i9; ++i9) {
            s2 += (short)i10;
        }
        Test.fFld %= (i9 | 1);
        i10 = i10;
        i11 = 353;
        while (--i11 > 0) {
            i10 -= i10;
            i10 = -8;
            l1 = 0L;
            Test.instanceCount = i9;
            i10 -= i10;
            i12 = 1;
            while (++i12 < 5) {
                Test.instanceCount = -1653;
                i10 *= i11;
                s2 >>= (short)i10;
                i10 = i10;
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d1) + l1 + (b ? 1 : 0) + i9 + i10 + s2 + i11 + i12;
    }

    public static void vMeth1(int i3, double d, short s1) {

        int i4=-194, i5=186, i6=22228, i7=-178, i8=4077, iArr1[]=new int[N];
        byte by=-36;
        boolean b1=true;

        FuzzerUtils.init(iArr1, -151);

        for (i4 = 13; 216 > i4; ++i4) {
            i6 = 8;
            do {
                for (i7 = 1; i7 < 3; ++i7) {
                    iArr1 = (iArr1 = (iArr1 = (iArr1 = iArr1)));
                    Test.fFld = Math.max(i4, iArr1[i7]++);
                    by ^= (byte)i6;
                    iArr1[i6 - 1] += ((++i5) + i7);
                }
                Test.instanceCount ^= (i5 -= (i3++));
                Test.instanceCount += (((i6 * Test.instanceCount) + Test.fFld) - i7);
                vMeth2(-1.43996, Test.instanceCount, b1);
                Test.fFld = i3;
                Test.instanceCount = i3;
                i5 = (int)Test.instanceCount;
                if (b1) break;
                s1 -= (short)-8;
            } while ((i6 -= 3) > 0);
        }
        vMeth1_check_sum += i3 + Double.doubleToLongBits(d) + s1 + i4 + i5 + i6 + i7 + i8 + by + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, int i1) {

        short s=5141;
        float f=109.11F, f1=0.820F, fArr[]=new float[N];
        int i2=159, i13=-6, i14=48, i15=-3, i16=250, iArr[]=new int[N];
        boolean b2=true;
        byte by1=105;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(lArr, -2268764610L);
        FuzzerUtils.init(fArr, -1.625F);

        Test.fFld = Math.abs((int)(i1 * (Test.instanceCount--)));
        iArr[(-68 >>> 1) % N] = (int)((-(--lArr[(46812 >>> 1) % N][(i >>> 1) % N])) - (s++));
        for (f = 251; f > 1; f--) {
            if (b2) {
                if (i != 0) {
                    vMeth_check_sum += i + i1 + s + Float.floatToIntBits(f) + i2 + (b2 ? 1 : 0) +
                        Float.floatToIntBits(f1) + i13 + i14 + i15 + i16 + by1 + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                vMeth_check_sum += i + i1 + s + Float.floatToIntBits(f) + i2 + (b2 ? 1 : 0) + Float.floatToIntBits(f1)
                    + i13 + i14 + i15 + i16 + by1 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            } else if (false) {
                vMeth1(i, Test.dFld, s);
            }
            f1 = i1;
            switch ((int)(((f % 1) * 5) + 61)) {
            case 66:
                switch ((int)((f % 7) + 6)) {
                case 6:
                    for (i13 = 1; i13 < 7; ++i13) {
                        i += (36157 + (i13 * i13));
                    }
                    break;
                case 7:
                    for (i15 = (int)(f); i15 < 7; i15++) {
                        b2 = false;
                        Test.instanceCount = -9L;
                    }
                    i = 4;
                case 8:
                    Test.instanceCount = i14;
                case 9:
                    b2 = b2;
                case 10:
                    i14 = (int)f;
                    break;
                case 11:
                    i16 += by1;
                    break;
                case 12:
                    i += (int)f;
                    break;
                default:
                    i2 = i2;
                }
            }
        }
        vMeth_check_sum += i + i1 + s + Float.floatToIntBits(f) + i2 + (b2 ? 1 : 0) + Float.floatToIntBits(f1) + i13 +
            i14 + i15 + i16 + by1 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        long l=73L, l2=8481425628846934037L;
        int i18=21464, i19=-8, i20=-12, iArr2[]=new int[N];
        double d2=-2.104379;
        short s3=-20742;
        boolean b3=false, bArr[][]=new boolean[N][N];
        byte by2=3;

        FuzzerUtils.init(iArr2, 42968);
        FuzzerUtils.init(bArr, true);

        l = 1;
        do {
            int i17=230;
            vMeth(i17, 18104);
            if (false) continue;
        } while ((l += 2) < 299);
        for (l2 = 17; l2 < 274; ++l2) {
            for (d2 = 98; d2 > l2; d2 -= 3) {
                iArr2[(int)(l2 - 1)] = 660;
                i20 = 1;
                do {
                    switch ((int)(((d2 % 6) * 5) + 28)) {
                    case 32:
                        s3 += (short)Test.instanceCount;
                        i19 = i19;
                        i19 = (int)l;
                        i18 -= i19;
                        break;
                    case 39:
                        Test.fFld *= (float)d2;
                        i18 -= (int)-6425979846114610198L;
                        break;
                    case 34:
                        switch (((i19 >>> 1) % 7) + 75) {
                        case 75:
                        case 76:
                            bArr[(int)(l2)][(int)(d2 + 1)] = b3;
                        case 77:
                        case 78:
                            iArr2[i20 - 1] ^= i19;
                            break;
                        case 79:
                            i19 += (((i20 * i19) + Test.fFld) - i18);
                            Test.fFld += ((long)i20 | (long)l);
                        case 80:
                            i19 = s3;
                            i18 *= -156;
                            break;
                        case 81:
                            i18 += 0;
                            by2 *= (byte)91;
                            break;
                        default:
                            switch ((int)((d2 % 1) + 17)) {
                            case 17:
                                s3 *= (short)-13;
                                i19 ^= 13;
                                break;
                            }
                            iArr2[i20] = i19;
                            i19 /= -163;
                            Test.dFld = Test.fFld;
                        }
                        i18 -= i20;
                        break;
                    case 50:
                        Test.fFld += 200;
                    case 53:
                        i19 -= (int)Test.instanceCount;
                        break;
                    case 44:
                        s3 *= (short)i18;
                        break;
                    default:
                        iArr2[(int)(l2 - 1)] = (int)1816190363756634066L;
                    }
                } while (++i20 < 1);
            }
        }


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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
